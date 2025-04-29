class Course {
    String semester;
    String[] courseNames;
    int[] marks;

    Course(String semester, String[] courseNames, int[] marks) {
        this.semester = semester;
        this.courseNames = courseNames;
        this.marks = marks;
    }

    void displayCourses() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Course: " + courseNames[i] + ", Marks: " + marks[i]);
        }
    }




    public static void main(String[] args) {
        String[] courses = {"Math", "Physics", "Chemistry"};
        int[] marks = {85, 90, 88};

        Course course = new Course("Semester 1", courses, marks);
        course.displayCourses();
    }
}
