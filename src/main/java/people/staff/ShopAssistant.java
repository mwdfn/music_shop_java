package people.staff;

import behaviours.IControlMoney;
import behaviours.ITalk;
import instrument_shop.InstrumentShop;
import instruments.Instrument;

public class ShopAssistant extends Staff implements ITalk {

    private double bonus;

    public ShopAssistant(String name, int age, String sex, String jobTitle, double bonus) {
        super(name, age, sex, jobTitle);
        this.bonus = bonus;
    }

    public String talk(String inputWords){
        return inputWords;
    }

}
