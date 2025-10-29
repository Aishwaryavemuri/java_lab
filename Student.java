public class Student {
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 45) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Student student1 = new Student("aishwarya", 1, 85);
        Student student2 = new Student("abhi", 2, 40);

        student1.displayInfo();
        System.out.println("Grade: " + student1.calculateGrade());

        System.out.println();

        student2.displayInfo();
        System.out.println("Grade: " + student2.calculateGrade());
    }
}