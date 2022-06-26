package people.customer;

import instruments.Instrument;
import people.Person;

import java.util.ArrayList;

public class Customer extends Person {

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
}
