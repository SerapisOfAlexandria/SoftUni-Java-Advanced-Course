package IteratorsAndComparatorsExercise.StackIterator;

import java.util.*;

public class StackStructure<Long> implements Iterable<Long> {
    List<Long> stack;

    public StackStructure(List<Long> stack) {
        this.stack = stack;
    }

    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int index = stack.size() - 1;
            @Override
            public boolean hasNext() {
                if (index < 0) {
                    return false;
                }
                return true;
            }

            @Override
            public Long next() {
                Long integer = stack.get(index);
                stack.remove(index--);
                return integer;
            }
        };
    }
}
