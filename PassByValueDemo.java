public class PassByValueDemo {

    static void changeNumber(int x) {
        System.out.println("Inside method before change: " + x);
        x = 99;
        System.out.println("Inside method after change: " + x);
    }

    static void changeStudent(Student st) {
        System.out.println("Inside method before change: " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("Inside method after change: " + st.completedCredits);
    }

    static void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
        st.completedCredits = 50;

        System.out.println("Inside method: " + st.name);
        System.out.println("Inside method credits: " + st.completedCredits);
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Experiment A");
        System.out.println("Before: " + number);

        changeNumber(number);

        System.out.println("After: " + number);

        Student s1 = new Student();

        s1.name = "Abeer";
        s1.completedCredits = 20;

        System.out.println("Experiment B");
        System.out.println("Before: " + s1.completedCredits);

        changeStudent(s1);

        System.out.println("After: " + s1.completedCredits);

        Student s2 = new Student();

        s2.name = "Ali";
        s2.completedCredits = 30;

        System.out.println("Experiment C");
        System.out.println("Before: " + s2.name);

        replaceStudent(s2);

        System.out.println("After: " + s2.name);
    }
}