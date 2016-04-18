package com.company;

/**
 * Created by User on 17.04.2016.
 */
public class Stack {
    int size;
    int[] data;

    Stack(int capacity) {
        data = new int[capacity];
    }

    void push(int value) {
        data[size++] = value;
    }

    int pop() {
        return data[--size];
    }
}
