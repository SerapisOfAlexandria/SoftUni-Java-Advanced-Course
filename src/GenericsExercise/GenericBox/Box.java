package GenericsExercise.GenericBox;

public class Box<T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", object.getClass().getName(), object);
    }
}
