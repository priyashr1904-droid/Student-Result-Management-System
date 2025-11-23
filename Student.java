public class Student {
    private int roll;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(int roll, String name, int marks1, int marks2, int marks3) {
        this.roll = roll;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getPercentage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double p = getPercentage();
        if (p >= 90) return "A+";
        else if (p >= 80) return "A";
        else if (p >= 70) return "B";
        else if (p >= 60) return "C";
        else return "D";
    }

    public String toString() {
        return "Roll: " + roll +
               " | Name: " + name +
               " | Marks: [" + marks1 + ", " + marks2 + ", " + marks3 + "]" +
               " | Total: " + getTotal() +
               " | %: " + getPercentage() +
               " | Grade: " + getGrade();
    }
}
