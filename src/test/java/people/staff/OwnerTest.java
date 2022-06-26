package people.staff;

import instrument_shop.InstrumentShop;
import instruments.InstrumentType;
import instruments.string_instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import people.customer.Customer;

import static org.junit.Assert.*;

public class OwnerTest {

    Owner owner;
    Customer customer1;
    Guitar guitar1;
    InstrumentShop instrumentShop;
    @Before
    public void before(){
        owner = new Owner("Darren", 42, "male", "owner");
        customer1 = new Customer("Linda", 25, "female", 1000.00);
        guitar1 = new Guitar(InstrumentType.STRING1,InstrumentType.STRING1,"spruce",100.00,200.00, 6);
        instrumentShop = new InstrumentShop("We're a small, family business, and we only sell string, brass, and woodwind instruments! Alright?!", 5000.00);
    }

    @Test
    public void canTalk(){;
        assertEquals("Welcome to the shop", owner.talk("Welcome to the shop"));
    }
    
//    @Test
//    public void canSellInstrument(){
//        instrumentShop.addStaff(owner);
//        instrumentShop.addCustomer(customer1);
//        instrumentShop.addInstrumentToInventory(guitar1);
//        instrumentShop.sellInstrument(customer1,guitar1);
//        assertEquals(1, customer1.getNumberOfPurchases());
//        assertEquals(800.00, customer1.getMoneyAmount(),0.0);
//        assertEquals(5200.00, instrumentShop.getTillValue(), 0.0);
//        assertEquals(0, instrumentShop.getNumberofInstrumentsInInventory());
//    }

}