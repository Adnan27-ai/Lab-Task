public class Task2Demo {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 40;

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        s1.addCredits(5);
        s2.addCredits(10);

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println(s1.remainingCredits(130));
        System.out.println(s2.remainingCredits(130));
    }
}