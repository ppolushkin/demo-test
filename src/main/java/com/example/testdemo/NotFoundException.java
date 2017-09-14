package com.example.testdemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
@ResponseStatus(HttpStatus.NO_CONTENT)
public class NotFoundException extends RuntimeException{
}
