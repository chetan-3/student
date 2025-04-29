import java.time.LocalDate;
import java.time.Period;

class Student {
    String name;
    LocalDate dob;

    Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2002, 1, 1); // January 1, 2002
        Student student = new Student("John", dob);
        student.displayInfo();
    }
}
