package DefiningClasses.Bank;

public class BankAccount {
    private int id;
    private double balance;
    private static double interestRate = 0.02;
    private static int idsCreated = 1;

    public BankAccount(){
        System.out.printf("Account ID%d created\n", idsCreated);
        this.id = idsCreated++;
        this.balance = 0.0;
    }

    public void getIdNum(){
        System.out.println(this.idsCreated);
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public static int getId() {
        return idsCreated;
    }

    public static void setInterestRate(double amount) {
        interestRate = amount;
    }
    public double getInterestRate(int years){
        return (balance * interestRate) * years;
    }

}
