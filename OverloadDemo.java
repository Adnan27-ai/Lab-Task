public class OverloadDemo {

    void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + ", Section " + section);
    }

    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in course number: " + numericCourseCode);
    }

    public static void main(String[] args) {

        OverloadDemo obj = new OverloadDemo();

        obj.enroll("CSC241");
        obj.enroll("CSC241", 2);
        obj.enroll(241);

        // obj.enroll();
        // obj.enroll("241", "2");
    }
}