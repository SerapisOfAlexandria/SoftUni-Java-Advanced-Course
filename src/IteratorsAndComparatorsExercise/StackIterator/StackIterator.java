package IteratorsAndComparatorsExercise.StackIterator;

import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterator<Long> {
    int index;
    List<Long> stack;

    public StackIterator(List<Long> stack) {
        this.stack = stack;
        this.index = stack.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (index <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public Long next() {
        return stack.get(index--);
    }

    public boolean isLast() {
        if (index >= 0) {
            return true;
        }
        return false;
    }
}
