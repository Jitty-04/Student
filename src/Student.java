import java.util.ArrayList;
import java.util.Scanner;

class Stud {
    String name;
    int rollno;
    String admnno;
    String college;

    public Stud(String name, int rollno, String admnno, String college) {
        this.name = name;
        this.rollno = rollno;
        this.admnno = admnno;
        this.college = college;
    }
}
public class Student {
    public static void main(String[] args) {
        ArrayList<Stud> arr = new ArrayList<Stud>();
        while (true) {
            System.out.println("1 - Add Employee");
            System.out.println("2 - View Employee");
            System.out.println("3 - Search an Employee");
            System.out.println("4 - Delete an Employee");
            System.out.println("5 - Exit");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
            }
        }
    }
}