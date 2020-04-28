package ru.letovo.it.Database.demo;


/*
CRUD операции
Create
Read
Update
Delete
 */

import org.springframework.data.repository.CrudRepository;

public interface UserAction extends CrudRepository<User,Integer> {
}
