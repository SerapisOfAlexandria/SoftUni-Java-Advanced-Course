package GenericsExercise.GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Comparable> {
    private T object;
    private List<T> listOfObjects = new ArrayList<>();

    public void addToList(T element) {
        listOfObjects.add(element);
    }

    public int numOfBiggerElements(T elementToCompare) {
        int count = 0;
        for (T element : listOfObjects) {
            if (elementToCompare.compareTo(element) < 0) {
                count++;
            }
        }
        return count;
    }


}
