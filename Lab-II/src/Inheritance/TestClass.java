package Inheritance;

import java.util.Scanner;

class SingleInheritance {
    String name,gender;
    static int age,salary;
    public void getDetails() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Name :");
            name=sc.nextLine();
            System.out.println("Enter your Gender :");
            gender=sc.nextLine();
            System.out.println("Enter your Age :");
            age=sc.nextInt();
            System.out.println("Enter your Salary :");
            salary=sc.nextInt();
        }
        System.out.println("\nName : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}

public class TestClass extends SingleInheritance {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.getDetails();
    }
}
