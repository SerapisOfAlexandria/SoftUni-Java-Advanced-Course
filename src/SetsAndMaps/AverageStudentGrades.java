package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, ArrayList<Double>> gradeRecords = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] record = scanner.nextLine().split("\\s+");
            String name = record[0];
            double grade = Double.parseDouble(record[1]);

            if (gradeRecords.containsKey(name)) {
                gradeRecords.get(name).add(grade);
            } else  {
                ArrayList<Double> list = new ArrayList<>();
                list.add(grade);
                gradeRecords.put(name, list);
            }
        }

        for (var entry : gradeRecords.entrySet()) {
            String student = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            String gradesFormatted = grades.stream()
                    .map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));

            double average = grades.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.0);

            String output = String.format("%s -> %s (avg: %.2f)", student, gradesFormatted, average);

            System.out.println(output);
        }
    }
}
