package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.Comparator;

public class PersonComparatorNameLength implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int lengthCompare = Integer.compare(o1.getName().length(), o2.getName().length());
        if (lengthCompare == 0) {
            return Character.compare(
                   Character.toLowerCase(o1.getName().charAt(0)),
                   Character.toLowerCase(o2.getName().charAt(0)));
        }
        return lengthCompare;
    }
}
