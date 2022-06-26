package instrument_shop;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.string_instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import people.customer.Customer;
import people.staff.Owner;

import static org.junit.Assert.*;

public class InstrumentShopTest {

    InstrumentShop instrumentShop;
    Instrument guitar1;
    Instrument banjo1;
    Owner owner;
    Customer customer1;
    @Before
    public void before(){
        instrumentShop = new InstrumentShop("We're a small, family business, and we only sell string, brass, and woodwind instruments! Alright?!", 5000.00);
        guitar1 = new Guitar(InstrumentType.STRING1,InstrumentType.STRING1,"spruce",100.00,200.00, 6);
        banjo1 = new Guitar(InstrumentType.STRING2,InstrumentType.STRING2,"mahogany",250.00,400.00, 5);
        owner = new Owner("Darren", 42, "male", "owner");
        customer1 = new Customer("Linda", 25, "female", 1000.00);
    }

    @Test
    public void shopHasAName() {
        assertEquals("We're a small, family business, and we only sell string, brass, and woodwind instruments! Alright?!", instrumentShop.getShopName());
    }

    @Test
    public void tillStartsWith5000() {
        assertEquals(5000.00, instrumentShop.getTillValue(), 0.0);
    }

    @Test
    public void staffListStartsEmpty() {
        assertEquals(0, instrumentShop.getNumberOfStaff());
    }

    @Test
    public void customerListStartsEmpty() {
        assertEquals(0, instrumentShop.getNumberOfCustomers());
    }

    @Test
    public void name() {
        assertEquals(0, instrumentShop.getNumberofInstrumentsInInventory());
    }
    @Test
    public void canAddStaffMemberToShop() {
        instrumentShop.addStaff(owner);
        assertEquals(1, instrumentShop.getNumberOfStaff());
    }

    @Test
    public void canAddCustomerToShop() {
        instrumentShop.addCustomer(customer1);
        assertEquals(1, instrumentShop.getNumberOfCustomers());
    }

    @Test
    public void canAddInstrumentToInventory() {
        instrumentShop.addInstrumentToInventory(guitar1);
        instrumentShop.addInstrumentToInventory(banjo1);
        assertEquals(2,instrumentShop.getNumberofInstrumentsInInventory());
    }
}