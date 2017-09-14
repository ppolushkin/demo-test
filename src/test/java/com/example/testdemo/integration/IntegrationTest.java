package com.example.testdemo.integration;

import com.example.testdemo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDelete() throws Exception {
        User[] users = restTemplate.getForEntity("http://localhost:{port}/users/", User[].class, port).getBody();
        Assert.assertEquals(2, users.length);

        restTemplate.delete("http://localhost:{port}/users/{userId}", port, 1);

        users = restTemplate.getForEntity("http://localhost:{port}/users/", User[].class, port).getBody();
        Assert.assertEquals(1, users.length);
    }


}