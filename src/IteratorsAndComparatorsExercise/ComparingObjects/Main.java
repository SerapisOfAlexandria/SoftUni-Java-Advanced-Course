package IteratorsAndComparatorsExercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String[] personInfo = scanner.nextLine().split("\\s+");

        while (!personInfo[0].equals("END")) {
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            String town = personInfo[2];

            Person person = new Person(name, age, town);
            personList.add(person);

            personInfo = scanner.nextLine().split("\\s+");
        }

        Person person = personList.get(Integer.parseInt(scanner.nextLine()) - 1);

        int numOfEqualPeople = 0;
        int numOfUnequalPeople = 0;

        for (Person element : personList) {
            if (element.compareTo(person) == 0) {
                numOfEqualPeople++;
            } else {
                numOfUnequalPeople++;
            }
        }

        int totalPeople = numOfEqualPeople + numOfUnequalPeople;

        System.out.println(numOfEqualPeople > 1
                ? String.format("%d %d %d", numOfEqualPeople, numOfUnequalPeople, totalPeople)
                : "No matches");
    }
}
