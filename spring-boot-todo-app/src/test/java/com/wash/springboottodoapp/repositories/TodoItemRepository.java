package com.wash.springboottodoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wash.springboottodoapp.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
