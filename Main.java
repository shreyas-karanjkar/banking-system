public class Main {
    public static void main(String[] args) {

        Account acc = new Savings("12345", "SBI", 1000);
        Customer customer = new Customer("Shreyas", "test@mail.com", "9999999999", acc);

        ATM atm = new ATM(1234);

        if (atm.validate(1234)) {

            atm.showMenu();

            System.out.println();

            customer.deposit(500);
            customer.withdraw(300);

            customer.showBalance();
        }
    }
}