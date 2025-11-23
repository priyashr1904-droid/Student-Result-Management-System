import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ResultSystem rs = new ResultSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT RESULT MANAGEMENT =====");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Student Records");
            System.out.println("3. Search Result by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int roll = Utils.getInt("Enter Roll Number: ");
                    String name = Utils.getString("Enter Student Name: ");
                    int m1 = Utils.getInt("Enter Marks 1: ");
                    int m2 = Utils.getInt("Enter Marks 2: ");
                    int m3 = Utils.getInt("Enter Marks 3: ");
                    rs.addStudent(new Student(roll, name, m1, m2, m3));
                    break;

                case 2:
                    rs.viewAllStudents();
                    break;

                case 3:
                    int r = Utils.getInt("Enter Roll Number to Search: ");
                    rs.viewResultByRoll(r);
                    break;

                case 4:
                    System.out.println("Exiting... Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
