package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatisdemo.domain.Todo;

@Mapper
public interface TodoMapper {
	void insertA(Todo todo);
    Todo select(int id);
}
