package SetsAndMaps;

import com.sun.source.tree.Tree;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Double> recordBook = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double gradeSum = 0;

            for (double grade : grades) {
                gradeSum += grade;
            }

            recordBook.put(name, gradeSum / grades.length);
        }

        for (var student : recordBook.entrySet()) {
            System.out.printf("%s is graduated with %s%n", student.getKey(), student.getValue());
        }
    }
}
