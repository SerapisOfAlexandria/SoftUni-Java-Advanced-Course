package Generics.ListUtilities;

import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>> T getMax(List<T> t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            T max = t.get(0);
            for (int i = 1; i < t.size(); i++) {
                if (max.compareTo(t.get(i)) < 0) {
                    max = t.get(i);
                }
            }
            return max;
        }
    }

    public static <T extends Comparable<T>> T getMin(List<T> t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            T min = t.get(0);
            for (int i = 1; i < t.size(); i++) {
                if (min.compareTo(t.get(i)) > 0) {
                    min = t.get(i);
                }
            }
            return min;
        }
    }
}
