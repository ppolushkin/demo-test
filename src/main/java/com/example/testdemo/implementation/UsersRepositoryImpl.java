package com.example.testdemo.implementation;

import com.example.testdemo.User;
import com.example.testdemo.UsersRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
@Repository
public class UsersRepositoryImpl implements UsersRepository {

    private final List<User> users = new ArrayList<>();

    public UsersRepositoryImpl() {
        users.add(new User(1L, "Anton", "Laletin", "1990-09-14", "dev"));
        users.add(new User(2L, "Pavel", "Polushkin", "1983-02-07", "dev"));
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User getById(long id) {
        return users.stream().filter(user -> user.id == id).findAny().orElseThrow(() -> new RuntimeException("Not found"));
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void modify(User user) {
        delete(user.id);
        add(user);
    }

    @Override
    public void delete(long id) {
        users.removeIf(user -> user.id == id);
    }
}
