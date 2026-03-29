public class Bank {
    private String bankName;
    private String location;

    public Bank(String name, String location) {
        this.bankName = name;
        this.location = location;
    }

    public void authorize() {
        System.out.println("Authorized by " + bankName);
    }
}