package com.example.mybatisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mybatisdemo.domain.Todo;
import com.example.mybatisdemo.mapper.TodoMapper;

@Controller
public class MainController {

	@Autowired
	private  TodoMapper todoMapper;


	@RequestMapping("test")
    @Transactional
    public String run() throws Exception { 
        Todo newTodo = new Todo();
        newTodo.setTitle("飲み会");
        newTodo.setDetails("銀座 19:00");

        todoMapper.insert(newTodo); // 新しいTodoをインサートする

        Todo loadedTodo = todoMapper.select(newTodo.getId()); // インサートしたTodoを取得して標準出力する
        System.out.println("ID       : " + loadedTodo.getId());
        System.out.println("TITLE    : " + loadedTodo.getTitle());
        System.out.println("DETAILS  : " + loadedTodo.getDetails());
        System.out.println("FINISHED : " + loadedTodo.isFinished());
        
        return "finish";
    }
}
