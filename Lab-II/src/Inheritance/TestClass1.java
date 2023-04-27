package Inheritance;

import java.util.*;

interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll,mark1,mark2;
    Student(String n, int r, int m1, int m2) {
        name=n;
        roll=r;
        mark1=m1;
        mark2=m2;
    }

    void display() {
        System.out.println("\nName of the Student : "+name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Mark of Subject 1 : "+mark1);
        System.out.println("Mark of Subject 2 : "+mark2);
    }
}

class Result extends Student implements Exam {
    Result(String n, int r, int m1, int m2) {
        super(n,r,m1,m2);
    }

    public void percent_cal() {}
    int total;
    void display() {
        super.display();
    }
}

public class TestClass1 {
    public static void main(String[] args) {
        String name;
        int rgno,m1,m2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Name :");
            name=sc.nextLine();
            System.out.println("Enter your Roll No. :");
            rgno=sc.nextInt();
            System.out.println("Enter your Mark for Subject 1 :");
            m1=sc.nextInt();
            System.out.println("Enter your Mark for Subject 2 :");
            m2=sc.nextInt();
        }
        Result R = new Result(name, rgno, m1, m2);
        R.display();
    }
}
