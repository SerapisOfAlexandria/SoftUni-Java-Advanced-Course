package SetsAndMapsExercise;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new HashMap<>();
        String[] contact = scanner.nextLine().split("-");

        while (!contact[0].equals("search")) {
            String name = contact[0];
            String number = contact[1];

            contacts.put(name, number);

            contact = scanner.nextLine().split("-");
        }

        String callPerson = scanner.nextLine();

        while (!callPerson.equals("stop")) {
            if (contacts.containsKey(callPerson)) {
                System.out.printf("%s -> %s\n", callPerson, contacts.get(callPerson));
            } else {
                System.out.printf("Contact %s does not exist.\n", callPerson);
            }

            callPerson = scanner.nextLine();
        }
    }
}
