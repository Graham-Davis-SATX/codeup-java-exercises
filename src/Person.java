public class Person {
    // Class Variable
    private String name;

    // return's the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String x){
        this.name = x;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
}