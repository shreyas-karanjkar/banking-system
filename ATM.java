public class ATM {
    private int pin;

    public ATM(int pin) {
        this.pin = pin;
    }

    public boolean validate(int enteredPin) {
        System.out.println("Enter PIN:");

        if (this.pin == enteredPin) {
            System.out.println("Access Granted\n");
            return true;
        } else {
            System.out.println("Invalid PIN");
            return false;
        }
    }

    public void showMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
    }
}