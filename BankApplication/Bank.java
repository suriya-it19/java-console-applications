package BankApplication.bank;

import BankApplication.customer.Customer;

interface Bank {
    BankDB db = new BankDB();

    // check customer details
    void checkCustomerDetails(Customer customer);

    // check total amount in the bank
    void checkTotalAmount();

    void withdraw();

    void drop();

}
