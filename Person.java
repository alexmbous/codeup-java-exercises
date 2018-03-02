public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String firstName = "Alex";
    public String lastName = "Bous";

    // returns the person's name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.firstName = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println(firstName + " " + lastName + " says hi!");
    }

}
