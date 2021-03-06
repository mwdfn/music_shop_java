package instrument_shop;

import behaviours.IControlMoney;
import behaviours.ISell;
import instruments.Instrument;
import people.customer.Customer;
import people.staff.Staff;

import java.util.ArrayList;

public class InstrumentShop implements ISell, IControlMoney {

    private String shopName;
    private ArrayList<Instrument> instruments;
    private ArrayList<Staff> staff;
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
    public double getMoneyAmount() {
        return till;
    }

    public int getNumberOfInstrumentsInInventory() {
        return instruments.size();
    }

    public void removeFromInventory(Instrument inputInstrument){
        instruments.remove(inputInstrument);
    }

    public int getNumberOfCustomers(){
        return customers.size();
    }

    public int getNumberOfStaff(){
        return staff.size();
    }

    public void increaseMoney(Instrument inputInstrument){
        till += inputInstrument.getSellingPrice();
    }

    public void decreaseMoney(Instrument inputInstrument){
        till -= inputInstrument.getSellingPrice();
    }

    public void addStaff(Staff inputStaff) {
        staff.add(inputStaff);
    }

    public void addCustomer(Customer inputCustomer) {
        customers.add(inputCustomer);
    }

    public void addInstrumentToInventory(Instrument inputInstrument){
        instruments.add(inputInstrument);
    }

    public void removeInstrumentFromInventory(Instrument inputInstrument) {
        instruments.remove(inputInstrument);
    }

    public String calculateInventoryMarkUp(Instrument inputInstrument){
        double buyingPrice = inputInstrument.getBuyingPrice();
        double sellingPrice = inputInstrument.getSellingPrice();
        return (sellingPrice-buyingPrice)/buyingPrice*100 + "%";
    }

    public String sellInstrument(Customer inputCustomer, Instrument inputInstrument){
        if(instruments.contains(inputInstrument) && inputCustomer.getMoneyAmount() >= inputInstrument.getSellingPrice()){
            inputCustomer.decreaseMoney(inputInstrument);
            till += inputInstrument.getSellingPrice();
            instruments.remove(inputInstrument);
            inputCustomer.addInstrumentToPurchases(inputInstrument);
            return "Thank you. Have a nice day!";
        } else if (!instruments.contains(inputInstrument)){
            return "Sorry, that item is out of stock.";
        } else if (inputCustomer.getMoneyAmount() < inputInstrument.getSellingPrice()) {
            return "Sorry, the " + inputInstrument.getInstrumentName() + " is ??" + inputInstrument.getSellingPrice()+ ".";
        }
        return "Hope to see you again!";
    }
}
