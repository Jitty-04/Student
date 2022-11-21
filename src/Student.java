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
                case 1:
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter Roll number ");
                    int roll = sc.nextInt();
                    System.out.println("Enter Admission number");
                    String admn = sc.next();
                    System.out.println("Enter College");
                    String college = sc.next();
                    Stud e = new Stud(name, roll, admn, college);
                    arr.add(e);
                    break;
                case 2 :
                    for (Stud emp : arr) {
                        System.out.println("Printing details of Student " );
                        System.out.println(emp.name);
                        System.out.println(emp.rollno);
                        System.out.println(emp.admnno);
                        System.out.println(emp.college);
                    }
                    break;
                case 3 :
                    System.out.println("Enter the Student admno");
                    Scanner obj1 = new Scanner(System.in);
                    String adm1 = obj1.next();
                    for (Stud e1 : arr) {
                        if (e1.admnno.equals(adm1)){
                            System.out.println("Details of employee with employee code " + adm1 + "is ");
                            System.out.println(e1.admnno);
                            System.out.println(e1.name);
                            System.out.println(e1.rollno);
                            System.out.println(e1.college);
                            break;
                        }
                        else {
                            System.out.println("No such employee found");
                        }
                    }
                    break;

            }
        }
    }
}