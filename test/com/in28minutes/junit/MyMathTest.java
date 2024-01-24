package com.in28minutes.junit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created By dhhaval thakkar on 2024-01-22
 */
public class MyMathTest {

    private static final Logger log = LogManager.getLogger();

    private final MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {

        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }

    @Test
    void calculateSum_EmptyMemberArray() {

        assertEquals(0, math.calculateSum(new int[]{}));
    }
}
