public class Customer {
    private String name;
    private String email;
    private String phone;
    private Account account;

    public Customer(String name, String email, String phone, Account account) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println("Depositing " + amount + "...");
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + "...");
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}