package DefiningClasses.Bank;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccountMap = new TreeMap<>();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Create":
                    bankAccountMap.put(BankAccount.getId(), new BankAccount());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(command[1]);
                    if (bankAccountMap.containsKey(id)) {
                        double amount = Double.parseDouble(command[2]);
                        bankAccountMap.get(id).deposit(amount);
                        String formattedDeposition = (amount % 1 == 0) ?
                                String.format("Deposited %.0f to ID%d", amount, id) :
                                String.format("Deposited %.2f to ID%d", amount, id);
                        System.out.println(formattedDeposition);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double newInterestRate = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(newInterestRate);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (bankAccountMap.containsKey(id)) {
                        System.out.printf("%.2f\n", bankAccountMap.get(id).getInterestRate(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
