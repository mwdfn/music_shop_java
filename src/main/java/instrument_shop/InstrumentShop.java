package instrument_shop;

import instruments.Instrument;
import people.customer.Customer;
import people.staff.Owner;

import java.util.ArrayList;

public class InstrumentShop {

    private String shopName;
    private ArrayList<Instrument> instruments;
    private ArrayList<Owner> staff;
    private ArrayList<Customer> customers;
    private double till;

    public InstrumentShop(String shopName, double till) {
        this.shopName = shopName;
        this.instruments = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.till = till;
    }

    public String getShopName() {
        return shopName;
    }
    public double getTillValue() {
        return till;
    }

    public int getNumberofInstrumentsInInventory() {
        return instruments.size();
    }

    public int getNumberOfCustomers(){
        return customers.size();
    }

    public int getNumberOfStaff(){
        return staff.size();
    }


    public void addStaff(Owner owner) {
    }
}
