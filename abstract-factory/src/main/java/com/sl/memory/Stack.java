package com.sl.memory;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author shuliangzhao
 * @Title: Stack
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 16:05
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAUT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAUT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[++size] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements,2*size + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
    }
}
