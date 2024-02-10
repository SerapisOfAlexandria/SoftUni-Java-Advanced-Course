package IteratorsAndComparatorsExercise.Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    private List<Integer> lake;
    private List<Integer> oddNumsInLake = new ArrayList<>();
    private List<Integer> evenNumsInLake = new ArrayList<>();
    private List<Integer> finalLakeSequence = new ArrayList<>();

    public Lake(List<Integer> lake) {
        this.lake = lake;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {
        private int index = 0;
        private boolean evenPhase = true;

        @Override
        public boolean hasNext() {
            if (!(index < lake.size()) && evenPhase) {
                index = 1;
                evenPhase = false;
            }
            return index < lake.size();
        }

        @Override
        public Integer next() {
            int number = lake.get(index);
            index += 2;
            return number;
        }
    }
}
