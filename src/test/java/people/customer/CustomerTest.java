package people.customer;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.string_instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer1;
    Instrument guitar1;
    @Before
    public void before(){
        customer1 = new Customer("Linda", 25, "female", 1000.00);
        guitar1 = new Guitar(InstrumentType.STRING1,InstrumentType.STRING1,"spruce",100.00,200.00, 6);

    }

    @Test
    public void customerPurchasesListStartsEmpty(){
        assertEquals(0,customer1.getNumberOfPurchases());
    }

    @Test
    public void customerStartsWithMoney(){
        assertEquals(1000.00, customer1.getMoneyAmount(), 0.0);
    }
    @Test
    public void canReduceMoney(){
        customer1.decreaseMoney(guitar1);
        assertEquals(800.00, customer1.getMoneyAmount(), 0.0);
    }

    @Test
    public void canIncreaseMoney(){
        customer1.increaseMoney(guitar1);
        assertEquals(1200.00, customer1.getMoneyAmount(), 0.0);
    }

    @Test
    public void canTalk(){
        assertEquals("Hello there", customer1.talk("Hello there"));
    }
}