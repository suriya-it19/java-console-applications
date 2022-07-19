package BankApplication.customer;

public class Customer {
    // to store customer details
    int id;
    String name;
    String number;
    String address;
    private long amount;
    private String username;
    private int pin;


    protected String getUsername() {}

    protected int getPin() {}

    private long getAmount() {}

    private void dropMoney(long amount) {}

    private long checkLimit(long amount) {}

    private long withdraw(long amount) {}

}
