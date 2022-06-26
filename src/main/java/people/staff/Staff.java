package people.staff;

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

//    public void sellInstrument(Customer inputCustomer, Instrument inputInstrument, InstrumentShop inputShop){
//        if(inputCustomer.getMoneyAmount() >= inputInstrument.getSellingPrice()){
//            inputCustomer.decreaseMoney(inputInstrument);
//            inputShop.getTillValue() += inputInstrument.getSellingPrice();
//            InstrumentShop.instruments.remove(inputInstrument);
//            inputCustomer.addInstrumentToPurchases(inputInstrument);
//        }
//    }

}
