package GenericsExercise.GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {
    List<T> list = new ArrayList<>();
    T objectToCompare;

    public void listAdd(T element) {
        list.add(element);
    }

    public Integer numOfBiggerElements() {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(objectToCompare) > 0) {
                count++;
            }
        }
        return count;
    }
}
