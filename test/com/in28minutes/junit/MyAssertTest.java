package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created By dhhaval thakkar on 2024-01-22
 */
public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test() {

        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");

        assertTrue(test, "Something went wrong");

        assertFalse(test2, "Does not contain in given list");

        assertArrayEquals(new int[] {1, 2}, new int[] {1, 2}, "Error in array");

        assertEquals(3, todos.size(), "Error Message");
    }
}
