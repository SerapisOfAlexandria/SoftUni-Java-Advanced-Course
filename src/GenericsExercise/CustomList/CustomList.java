package GenericsExercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList <T extends Comparable> {
    private List<T> customList = new ArrayList<>();

    public void add(T element) {
        customList.add(element);
    }

    public void remove(int index) {
        customList.remove(index);
    }

    public boolean contains(T element) {
        if (customList.contains(element)) {
            return true;
        }
        return false;
    }

    public void swap(int indexOne, int indexTwo) {
        T temp = customList.get(indexOne);
        customList.add(indexOne + 1, customList.get(indexTwo));
        customList.remove(indexOne);
        customList.add(indexTwo + 1, temp);
        customList.remove(indexTwo);
    }

    public int countGreaterThan(T elementToCompare) {
        int count = 0;
        for (T element : customList) {
            if (elementToCompare.compareTo(element) < 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        T biggestElement = customList.get(0);
        for (int i = 1; i <= customList.size() - 1; i++) {
            T element = customList.get(i);
            if (element.compareTo(biggestElement) > 0) {
                biggestElement = element;
            }
        }
        return biggestElement;
    }

    public T getMin() {
        T smallestElement = customList.get(0);
        for (int i = 1; i <= customList.size() - 1; i++) {
            T element = customList.get(i);
            if (element.compareTo(smallestElement ) < 0) {
                smallestElement = element;
            }
        }
        return smallestElement;
    }

    public void printEach() {
        customList.forEach(System.out::println);
    }

    public void sort() {
        customList.sort(((o1, o2) -> o1.compareTo(o2)));
    }

}
