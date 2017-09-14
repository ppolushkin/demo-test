package com.example.conf;

import com.example.testdemo.TestDemoApplication;
import com.example.testdemo.implementation.UsersRepositoryImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
@TestConfiguration
@ComponentScan(
        basePackages = {"com.example.testdemo"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = TestDemoApplication.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = UsersRepositoryImpl.class),
        }
)
public class ApplicationConfiguration {
}
