package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.web.model.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index(Model model) {
        List<Todo> todoList = todoList();
        model.addAttribute("todoList", todoList);
        return "index";
    }

    private List<Todo> todoList(){
        List<Todo> list = new ArrayList<>();
        list.add(todo("成瀬", "Javaバージョンアップ", "じぇじぇじぇ", date(2024, 8, 17)));
        list.add(todo("高田", "進捗管理", "みんな働いてくれる♪", date(2024, 8, 23)));
        list.add(todo("丸山", "TailwindCss調査", "難しいorz", date(2024, 8, 17)));
        return list;
    } 

    private Date date(int year, int month, int date){
        LocalDateTime ldt = LocalDateTime.of(2016, 6, 7, 0, 0, 0);
        return Date.from(ldt.toInstant(ZoneOffset.of("+9")));
    }
    

    private Todo todo(String user, String title, String content, Date limit){
        Todo todo = new Todo();
        todo.setUser(user);
        todo.setTitle(title);
        todo.setContent(content);
        todo.setLimit(limit);
        return todo;
    }
}