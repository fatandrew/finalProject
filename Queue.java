package com.company;

/**
 * Created by User on 17.04.2016.
 */
public class Queue {
    int size;
    int head;
    int tail;
    int[] data;

    Queue(int size) {
        data = new int[this.size = size];
    }

    void add(int value) {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
    }

    int extract() {
        if (++head == size)
            head = 0;
        return data[head];
    }

    boolean isEmpty() {
        return head == tail;
    }

}
