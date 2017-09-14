package com.example.testdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public List<User> getAll() {
        return usersRepository.getAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return usersRepository.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        usersRepository.delete(id);
    }

    @PostMapping
    public void add(@RequestBody User user) {
        usersRepository.add(user);
    }

    @PutMapping
    public void modify(@RequestBody User user) {
        usersRepository.modify(user);
    }

}
