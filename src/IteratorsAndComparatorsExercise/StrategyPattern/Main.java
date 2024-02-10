package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] personInfo = scanner.nextLine().split("\\s+");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            Person person = new Person(name, age);
            personList.add(person);
        }

        PersonComparatorNameLength personComparatorNameLength = new PersonComparatorNameLength();
        ComparatorAge personComparatorFirstLetter = new ComparatorAge();

        Set<Person> sortByNameLength = new TreeSet<>(personComparatorNameLength);
        Set<Person> sortByFirstLetter = new TreeSet<>(personComparatorFirstLetter);

        for (Person element : personList) {
            sortByNameLength.add(element);
            sortByFirstLetter.add(element);
        }

        sortByNameLength.stream()
                .forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
        sortByFirstLetter.stream()
                .forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
    }
}
