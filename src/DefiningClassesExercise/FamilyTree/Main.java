package DefiningClassesExercise.FamilyTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex1 = "(?<parentName>\\w+ \\w+) - (?<childName>\\w+ \\w+)"; // Name - Name
        String regex2 = "(?<parentName>\\w+ \\w+) - (?<childDate>\\d{1,2}/\\d{1,2}/\\d{4})"; // Name - Date
        String regex3 = "(?<parentDate>\\d{1,2}/\\d{1,2}/\\d{4}) - (?<childName>\\w+ \\w+)"; // Date - Name
        String regex4 = "(?<parentDate>\\d{1,2}/\\d{1,2}/\\d{4}) - (?<childDate>\\d{1,2}/\\d{1,2}/\\d{4})"; // Date - Date

        String name = scanner.nextLine();

        Map<String, String> dateToNameMap = new HashMap<>();
        Map<String, String> nameToDateMap = new HashMap<>();
        Map<String, Person> personMap = new HashMap<>();

        String info = scanner.nextLine();
        while (!info.equals("End")) {
            if (info.matches(".+ - .+")) {
                String[] splitInformation = info.split(" - ");
                if (info.matches(regex2)) {
                    String parentName = splitInformation[0];
                    String childDate = splitInformation[1];
                    addNewPersons(personMap, parentName, childDate);
                } else if (info.matches(regex1)) {
                    String parentName = splitInformation[0];
                    String childName = splitInformation[1];
                    addNewPersons(personMap, parentName, childName);
                } else if (info.matches(regex3)) {
                    String parentDate = splitInformation[0];
                    String childName = splitInformation[1];
                    addNewPersons(personMap, parentDate, childName);
                } else if (info.matches(regex4)) {
                    String parentDate = splitInformation[0];
                    String childDate = splitInformation[1];
                    addNewPersons(personMap, parentDate, childDate);
                }
            } else {
                 String[] information = info.split(" ");
                 String personName = information[0] + " " + information[1];
                 String personDate= information[2];

                 nameToDateMap.put(personDate, personName);
                 dateToNameMap.put(personName, personDate);
            }
            info = scanner.nextLine();
        }
    }
    public static String listOfPersons(List<Person> list, Map<String, String> nameToDateMap, Map<String, String> dateToNameMap) {
        String names = "";

        for (Person person : list) {
            names += getNameDate(person, nameToDateMap, dateToNameMap) + "\n";
        }

        return names;
    }

    public static String getNameDate(Person p, Map<String, String> nameToDateMap, Map<String, String> dateToNameMap) {
        String name = "";

        if (nameToDateMap.containsKey(p.getName())) {
            name = p.getName() + " " + nameToDateMap.get(p.getName());
        }

        if (dateToNameMap.containsKey(p.getDate())) {
            name = dateToNameMap.get(p.getDate()) + " " + p.getDate();
        }

        return name;
    }
    public static void addNewPersons(Map<String, Person> personMap, String parentInfo, String childInfo) {
        if (personMap.containsKey(parentInfo)) {
            if (personMap.containsKey(childInfo)) {
                personMap.get(parentInfo).addChildren(personMap.get(childInfo));
                personMap.get(childInfo).addParent(personMap.get(parentInfo));
            } else {
                Person child = new Person(); //Create
                child.setDate(childInfo); //Assign Date
                child.addParent(personMap.get(parentInfo)); //Add a parent
                personMap.get(parentInfo).addChildren(child);
                personMap.put(childInfo, child); //Add the person(child) to the personMap
            }
        } else {
            if (personMap.containsKey(childInfo)) {
                Person parent = new Person(); //Create parent
                parent.setName(parentInfo); //Set name
                parent.addChildren(personMap.get(childInfo));
                personMap.get(childInfo).addParent(parent);
                personMap.put(parentInfo, parent);
            } else {
                Person parent = new Person(); //Create parent
                parent.setName(parentInfo); //Set name
                Person child = new Person(); //Create child
                child.setDate(childInfo); //Set child date
                parent.addChildren(child); //Add child to parents' children list
                child.addParent(parent); //Add parent to child's parents list
                personMap.put(parentInfo, parent); //Add person to map
                personMap.put(childInfo, child); //Add person to map
            }
        }
    }
}
