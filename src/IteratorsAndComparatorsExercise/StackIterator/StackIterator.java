package IteratorsAndComparatorsExercise.StackIterator;

import java.util.*;

public class StackIterator<String> implements Iterable<String> {
    List<String> stack;

    public StackIterator(List<String> stack) {
        this.stack = stack;
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("No elements");
        } else {
            stack.remove(stack.size() - 1);
        }
    }

    public void push(List<String> elements) {
        stack.addAll(elements);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = stack.size() - 1;

            @Override
            public boolean hasNext() {
                if (index == -1) {
                    return false;
                }
                return true;
            }

            @Override
            public String next() {
                return stack.get(index--);
            }
        };
    }
}
