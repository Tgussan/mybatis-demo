package com.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatisdemo.domain.Todo;

@Mapper
public interface TodoMapper {
	void insert(Todo todo);
    Todo select(int id);
}
