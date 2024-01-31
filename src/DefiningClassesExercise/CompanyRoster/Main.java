package DefiningClassesExercise.CompanyRoster;

import DefiningClassesExercise.OpinionBall.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        Map<String, List<Integer>> departmentsSalaries = new HashMap<>();
        Map<String, Double> departmentsAvgSalaries = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] employeeInfo = scanner.nextLine().split(" ");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            int age;
            String email;
            Employee employee = null;

            switch (employeeInfo.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (employeeInfo[4].matches("\\d+")) {
                        age = Integer.parseInt(employeeInfo[4]);
                        employee = new Employee(name, salary, position, department, age);
                    } else {
                        email = employeeInfo[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    email = employeeInfo[4];
                    age = Integer.parseInt(employeeInfo[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }
            
            employees.add(employee);
        }

        for (Employee emp : employees) {
            System.out.print(emp.toString());
        }
    }
}

