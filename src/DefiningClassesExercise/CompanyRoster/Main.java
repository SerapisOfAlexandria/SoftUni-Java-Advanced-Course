package DefiningClassesExercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        Map<String, Double> departmentsTotalSalaries = new HashMap<>();
        Map<String, Integer> countByDepartment = new HashMap<>();
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

            if (departmentsTotalSalaries.containsKey(department)) {
                departmentsTotalSalaries.put(department, departmentsTotalSalaries.get(department) + salary);
                countByDepartment.put(department, countByDepartment.get(department) + 1);
            } else {
                departmentsTotalSalaries.put(department, salary);
                countByDepartment.put(department, 1);
            }

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

        double highestAvgSalaryByDepartment = 0;
        String departmentWithHighestAvgSalary = "";
        Comparator<Employee> comparator = ((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));

        for (String key : departmentsTotalSalaries.keySet()) {
            if (highestAvgSalaryByDepartment < departmentsTotalSalaries.get(key) / countByDepartment.get(key)) {
                highestAvgSalaryByDepartment = departmentsTotalSalaries.get(key) / countByDepartment.get(key);
                departmentWithHighestAvgSalary = key;
            }
        }

        final String departmentWithHighestAvgSalaryFinal = departmentWithHighestAvgSalary;

        System.out.println("Highest Average Salary: "+ departmentWithHighestAvgSalary);
        employees.stream()
                .filter(employee -> employee.getDepartment().equals(departmentWithHighestAvgSalaryFinal))
                .sorted(comparator)
                .map(Employee::toString)
                .forEach(System.out::print);

    }
}

