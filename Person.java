public class Person {
    // Private fields
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Person
        Person p = new Person();

        // Set name and age using setters
        p.setName("Himanshu");
        p.setAge(25);

        // Get and print name and age using getters
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
