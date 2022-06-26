package people.staff;

import behaviours.ITalk;

public class Owner extends Staff implements ITalk {

    public Owner(String name, int age, String sex, String jobTitle) {
        super(name, age, sex, jobTitle);
    }

    public String talk(String inputWords){
        return inputWords;
    }
}
