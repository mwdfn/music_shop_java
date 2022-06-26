package people.staff;

import people.Person;

public abstract class Staff extends Person {

    private String jobTitle;

    public Staff(String name, int age, String sex, String jobTitle) {
        super(name, age, sex);
        this.jobTitle = jobTitle;
    }
}
