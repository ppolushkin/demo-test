package com.example.testdemo;

import java.util.List;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
public interface UsersRepository {

    List<User> getAll();

    User getById(long id);

    void add(User user);

    void modify(User user);

    void delete(long id);

}
