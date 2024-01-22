package com.in28minutes.junit;

/**
 * Created By dhhaval thakkar on 2024-01-22
 */
public class MyMath {

    public int calculateSum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
