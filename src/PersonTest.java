public class PersonTest {
    public static void main(String[] args) {

        Input input = new Input();

        input.getString();
        input.getString("Give me something")

        Person human = new Person();
        human.setName("Graham");
        human.sayHello();

        Person employee = new Person();
        employee.setName("Walt");
        employee.sayHello();
    }
}
