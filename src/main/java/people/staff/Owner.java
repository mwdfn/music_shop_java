package people.staff;

import people.Person;

public class Owner extends Person {

    private String jobTitle;

    public Owner(String name, int age, String sex, String jobTitle) {
        super(name, age, sex);
        this.jobTitle = jobTitle;
    }
}
