package Inheritance;

import java.util.Scanner;

interface Bank {
    double rate=12.0f;
    int no_of_years=3;
    void show();
}

class Customer {
    String name;
    int customerID;
    Customer(String n, int ID) {
        name=n;
        customerID=ID;
    }

    void display() {
        System.out.println("Name : "+name);
        System.out.println("Customer ID : "+customerID);
    }
}

class Account extends Customer implements Bank {
    int accountNO;
    float balance;
    Account(String n, int ID, int ano, float b) {
        super(n, ID);
        accountNO=ano;
        balance=b;
    }

    public void show() {
        display();
        System.out.println("Account No : "+accountNO);
        System.out.println("Balance : "+balance);
    }

    void Interest() {
        show();
        double i=(rate*balance*no_of_years)/100;
        System.out.println("Interest : "+i);
    }
}

public class TestClass3 {
    public static void main(String[] args) {
        String n;
        int ID,ano;
        float b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Name :");
            n=sc.nextLine();
            System.out.println("Enter your Customer ID :");
            ID=sc.nextInt();
            System.out.println("Enter your Account No :");
            ano=sc.nextInt();
            System.out.println("Enter your Balance :");
            b=sc.nextInt();
        }
        System.out.println("\n");
        Account A = new Account(n, ID, ano, b);
        A.Interest();
    }
}
