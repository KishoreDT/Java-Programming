package PS1;
import java.util.Scanner;

interface Student {
    void getValue();
}

class Department implements Student {
    Scanner sc = new Scanner(System.in);
    int attendance,sno;
    String sname,cls;
    public void getAttendance() {
        System.out.print("\nEnter Attendance in percentage : ");
        attendance = sc.nextInt();
    }

    public void getValue() {
        System.out.print("Enter S. No. : ");
        sno = sc.nextInt();
        System.out.print("Enter Name : ");
        sname = sc.next();
        System.out.print("Enter Class : ");
        cls = sc.next();
        System.out.println("\nS. No. : "+sno);
        System.out.println("Name : "+sname);
        System.out.println("Class : "+cls);
    }
}

class Exam extends Department {
    public void calAttendance() {
    }

    public Boolean eligible() {
        if (attendance<60) {
            return false;
        }

        else {
            return true;
        }
    }
}

public class PS {
    public static void main(String[] args) {
        Exam E = new Exam();
		E.getValue();
		E.getAttendance();
		E.calAttendance();
		System.out.println("\nEligibility : " + E.eligible());
    }
}
