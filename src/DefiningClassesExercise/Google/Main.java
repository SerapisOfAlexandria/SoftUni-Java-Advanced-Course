package DefiningClassesExercise.Google;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> mapOfPeople = new HashMap<>();
        String[] info = scanner.nextLine().split("\\s+");

        while (!info[0].equals("End")) {
            String name = info[0];
            Person person;

            if (mapOfPeople.containsKey(name)) {
                person = mapOfPeople.get(name);
            } else {
                person = new Person(name);
                mapOfPeople.put(name, person);
            }

            switch (info[1]) {
                case "company":
                    String companyName = info[2];
                    String department = info[3];
                    double salary = Double.parseDouble(info[4]);

                    Person.personCompany company = new Person.personCompany(companyName, department, salary);
                    person.updateCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = info[2];
                    String pokemonType = info[3];

                    Person.personPokemon pokemon = new Person.personPokemon(pokemonName, pokemonType);
                    person.addPokemon(pokemon);
                    break;
                case "parents":
                    String parentName = info[2];
                    String parentBirthday = info[3];

                    Person.personParents parent = new Person.personParents(parentName, parentBirthday);
                    person.addParent(parent);
                    break;
                case "children":
                    String childName = info[2];
                    String childBirthday = info[3];

                    Person.personChildren child = new Person.personChildren(childName, childBirthday);
                    person.addChild(child);
                    break;
                case "car":
                    String carModel = info[2];
                    int carSpeed = Integer.parseInt(info[3]);

                    Person.personCar car = new Person.personCar(carModel, carSpeed);
                    person.updateCar(car);
                    break;
            }

            info = scanner.nextLine().split("\\s+");
        }

        String printInfoAbout = scanner.nextLine();

        System.out.print(mapOfPeople.get(printInfoAbout).toString());
    }
}
