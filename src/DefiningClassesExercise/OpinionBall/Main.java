package DefiningClassesExercise.OpinionBall;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            Person person = new Person(name, age);

            personList.add(person);
        }

        String result = personList.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName() + " - " + person.getAge())
                .collect(Collectors.joining("\n"));

        System.out.println(result);
    }
}
