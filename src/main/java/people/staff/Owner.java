package people.staff;

import behaviours.IControlMoney;
import behaviours.ITalk;
import instrument_shop.InstrumentShop;
import instruments.Instrument;
import people.Person;
import people.customer.Customer;

public class Owner extends Staff implements ITalk {

    public Owner(String name, int age, String sex, String jobTitle) {
        super(name, age, sex, jobTitle);
    }

    public String talk(String inputWords){
        return inputWords;
    }
}
