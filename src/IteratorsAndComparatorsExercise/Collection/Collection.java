package IteratorsAndComparatorsExercise.Collection;

        import java.util.Iterator;

public class Collection implements Iterable<String> {

    String[] strings;
    int index = 0;

    public Collection(String... strings) {
        this.strings = strings;
    }

    public boolean hasNext() {
        if (index == strings.length - 1) {
            return false;
        }
        return true;
    }

    public boolean move() {
        if (hasNext() && strings.length != 0) {
            index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (strings.length == 0) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(strings[index]);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < strings.length;
            }

            @Override
            public String next() {
                return strings[index++];
            }
        };
    }
}
