package GenericsExercise.GenericBoxOfInteger;

public class BoxOfStrings<T> {
    private T object;

    public BoxOfStrings(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", object.getClass().getName(), object);
    }
}
