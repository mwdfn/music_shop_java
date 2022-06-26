package people.staff;

import behaviours.IControlMoney;
import instrument_shop.InstrumentShop;
import instruments.Instrument;
import people.Person;
import people.customer.Customer;

public abstract class Staff extends Person {

    private String jobTitle;

    public Staff(String name, int age, String sex, String jobTitle) {
        super(name, age, sex);
        this.jobTitle = jobTitle;
    }


}
