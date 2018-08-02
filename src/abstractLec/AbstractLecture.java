package abstractLec;

public class AbstractLecture {
    public static void main(String[] args) {
        Accountant ac = new Accountant();
        System.out.println(ac.work());
        System.out.println(ac.quit());
    }
}
