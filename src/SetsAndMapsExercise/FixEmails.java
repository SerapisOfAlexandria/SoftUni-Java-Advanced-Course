package SetsAndMapsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap();
        String regex = "^.+@(.+)\\.(?!com|uk|us).+$";
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }

            String email = scanner.nextLine();

            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                emails.put(name, email);
            }
        }

        emails.entrySet().forEach(entry -> {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
        });
    }
}
