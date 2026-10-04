import java.util.Scanner;

class Student {
    private String usn;
    private String name;

    public void acceptDetails(Scanner sc) {
        while (true) {
            System.out.print("Enter USN (max 10 characters): ");
            usn = sc.nextLine();
            if (usn.length() > 0 && usn.length() <= 10) {
                break;
            } else {
                System.out.println("Invalid! USN must be 1 to 10 characters long. Try again.");
            }
        }

        while (true) {
            System.out.print("Enter Name : ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid! Name must contain only alphabets. Try again.");
            }
        }
    }

    public void displayDetails() {
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.println("--------------------");
    }
}

public class StudentTestt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].acceptDetails(sc);
        }

        System.out.println("\n===== Student Details =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].displayDetails();
        }
        sc.close();
    }
}
