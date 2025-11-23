import java.util.ArrayList;

public class ResultSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student record added successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- STUDENT RESULT LIST ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void viewResultByRoll(int roll) {
        for (Student s : students) {
            if (s.getRoll() == roll) {
                System.out.println("\n--- RESULT FOUND ---");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student with this roll number not found!");
    }
}
