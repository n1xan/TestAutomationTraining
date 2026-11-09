package objectsExample;

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;
    private int egn;
    private int id;
    private int age;

    public Person(String fname, String lastName, int egn, int age) {
        firstName = fname;
        this.lastName = lastName;
        this.egn = egn;
        this.age = age;
        Random r = new Random();
        this.id = r.nextInt();
    }

    public int getId() {
        return this.id;
    }

    public void changeFamilyName(String newName) {
        if (newName.equals(this.lastName)) {
            throw new IllegalArgumentException("The name is the same as existing");
        }

        this.lastName = newName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
