package people.customer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer1;
    @Before
    public void before(){
        customer1 = new Customer("Linda", 25, "female", 1000.00);
    }

    @Test
    public void customerPurchasesListStartsEmpty(){
        assertEquals(0,customer1.getNumberOfPurchases());
    }
}