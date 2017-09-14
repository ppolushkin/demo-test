package com.example.conf;

import com.example.testdemo.User;
import com.example.testdemo.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
@Component
public class TestingUserRepositoryImpl implements UsersRepository {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void modify(User user) {

    }

    @Override
    public void delete(long id) {

    }
}
