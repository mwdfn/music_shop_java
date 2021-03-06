package people.customer;

import behaviours.IControlMoney;
import behaviours.ITalk;
import instruments.Instrument;
import people.Person;

import java.util.ArrayList;

public class Customer extends Person implements IControlMoney, ITalk {

    private double money;
    private ArrayList<Instrument> purchases;

    public Customer(String name, int age, String sex, double money) {
        super(name, age, sex);
        this.money = money;
        this.purchases = new ArrayList<>();
    }

    public int getNumberOfPurchases() {
        return purchases.size();
    }

    public double getMoneyAmount() {
        return money;
    }

    public void addInstrumentToPurchases(Instrument inputInstrument){
        purchases.add(inputInstrument);
    }

    public void increaseMoney(Instrument inputInstrument){
        money += inputInstrument.getSellingPrice();
    };

    public void decreaseMoney(Instrument inputInstrument){
        money -= inputInstrument.getSellingPrice();
    };

    public String talk(String inputWords){
        return inputWords;
    }

}
