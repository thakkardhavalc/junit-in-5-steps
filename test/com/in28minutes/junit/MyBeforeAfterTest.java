package com.in28minutes.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Message from beforeAll method");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Message from beforeEach method");
    }

    @Test
    void test1() {
        System.out.println("Message from test1 method");
    }

    @Test
    void test2() {
        System.out.println("Message from test2 method");
    }

    @Test
    void test3() {
        System.out.println("Message from test3 method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Message from afterEach method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Message from afterAll method");
    }
}
