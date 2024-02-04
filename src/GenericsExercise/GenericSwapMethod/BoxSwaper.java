package GenericsExercise.GenericSwapMethod;

import java.util.List;

public class BoxSwaper<T> {
    private T object;

    public BoxSwaper(T object) {
        this.object = object;
    }

    public static <T> void swap(int x, int y, List<T> list) {
        T holder = list.get(x);
        list.add(x + 1, list.get(y));
        list.remove(x);
        list.add(y + 1, holder);
        list.remove(y);
    }

    public String toString() {
        return String.format("%s: %s\n", object.getClass().getName(), object);
    }
}
