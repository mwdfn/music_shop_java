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
    Customer customer2;
    Customer customer3;
    @Before
    public void before(){
        instrumentShop = new InstrumentShop("We're a small, family business, and we only sell string, brass, and woodwind instruments! Alright?!", 5000.00);
        guitar1 = new Guitar(InstrumentType.STRING1,InstrumentType.STRING1,"spruce",100.00,200.00, 6);
        banjo1 = new Guitar(InstrumentType.STRING2,InstrumentType.STRING2,"mahogany",250.00,400.00, 5);
        owner = new Owner("Darren", 42, "male", "owner");
        customer1 = new Customer("Linda", 25, "female", 1000.00);
        customer2 = new Customer("Kieran", 61, "male", 500.00);
        customer3 = new Customer("Bob", 19, "male", 200.00);
    }

    @Test
    public void shopHasAName() {
        assertEquals("We're a small, family business, and we only sell string, brass, and woodwind instruments! Alright?!", instrumentShop.getShopName());
    }

    @Test
    public void tillStartsWith5000() {
        assertEquals(5000.00, instrumentShop.getMoneyAmount(), 0.0);
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
    public void inventoryStartsEmpty() {
        assertEquals(0, instrumentShop.getNumberOfInstrumentsInInventory());
    }
    @Test
    public void canAddStaffMemberToShop() {
        instrumentShop.addStaff(owner);
        assertEquals(1, instrumentShop.getNumberOfStaff());
    }

    @Test
    public void canAddCustomerToShop() {
        instrumentShop.addCustomer(customer1);
        instrumentShop.addCustomer(customer2);
        assertEquals(2, instrumentShop.getNumberOfCustomers());
    }

    @Test
    public void canAddInstrumentToInventory() {
        instrumentShop.addInstrumentToInventory(guitar1);
        instrumentShop.addInstrumentToInventory(banjo1);
        assertEquals(2,instrumentShop.getNumberOfInstrumentsInInventory());
    }

    @Test
    public void canRemoveInstrumentFromInventory(){
        instrumentShop.addInstrumentToInventory(guitar1);
        instrumentShop.addInstrumentToInventory(banjo1);
        instrumentShop.removeInstrumentFromInventory(guitar1);
        assertEquals(1,instrumentShop.getNumberOfInstrumentsInInventory());
    }

    @Test
    public void canCalculateInstrumentMarkUpWithInterface(){
        instrumentShop.addInstrumentToInventory(guitar1);
        assertEquals("100.0%", instrumentShop.calculateInventoryMarkUp(guitar1));
    }

    @Test
    public void canSellInstrument(){
        instrumentShop.addStaff(owner);
        instrumentShop.addCustomer(customer1);
        instrumentShop.addInstrumentToInventory(guitar1);
//        instrumentShop.sellInstrument(customer1,guitar1);
        assertEquals("Thank you. Have a nice day!", instrumentShop.sellInstrument(customer1,guitar1));
        assertEquals(1, customer1.getNumberOfPurchases());
        assertEquals(800.00, customer1.getMoneyAmount(),0.0);
        assertEquals(5200.00, instrumentShop.getMoneyAmount(), 0.0);
        assertEquals(0, instrumentShop.getNumberOfInstrumentsInInventory());
    }

    @Test
    public void cannotSellOutOfStockInstrument(){
        instrumentShop.addStaff(owner);
        instrumentShop.addCustomer(customer1);
        instrumentShop.addInstrumentToInventory(guitar1);
        instrumentShop.removeInstrumentFromInventory(guitar1);
        assertEquals("Sorry, that item is out of stock.", instrumentShop.sellInstrument(customer1,guitar1));
    }

    @Test
    public void cannotSellInstrumentIfCustomerLacksFunds(){
        instrumentShop.addStaff(owner);
        instrumentShop.addCustomer(customer3);
        instrumentShop.addInstrumentToInventory(banjo1);
        assertEquals("Sorry, the banjo is ??400.0.",instrumentShop.sellInstrument(customer3,banjo1));
    }

}