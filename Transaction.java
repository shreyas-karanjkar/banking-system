import java.util.Date;

public class Transaction {
    protected Date date;
    protected String type;
    protected double amount;

    public Transaction(String type, double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    public void printDetails() {
        System.out.println(date + " - " + type + " - " + amount);
    }
}
