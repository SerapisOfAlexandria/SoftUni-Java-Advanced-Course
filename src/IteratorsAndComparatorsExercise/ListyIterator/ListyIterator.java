package IteratorsAndComparatorsExercise.ListyIterator;

public class ListyIterator {

    String[] strings;
    int index = 0;

    public ListyIterator(String... strings) {
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

}
