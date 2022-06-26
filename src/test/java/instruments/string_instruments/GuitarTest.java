package instruments.string_instruments;

import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar1;
    @Before
    public void before(){
        guitar1 = new Guitar(InstrumentType.STRING1,InstrumentType.STRING1,"spruce",100.00,200.00, 6);
    }

    @Test
    public void instrumentHasName(){
        assertEquals("guitar", guitar1.getInstrumentName());
    }

    @Test
    public void instrumentHasFamily() {
        assertEquals("string", guitar1.getInstrumentFamily());
    }

    @Test
    public void instrumentHasMaterial() {
        assertEquals("spruce", guitar1.getInstrumentMaterial());
    }

    @Test
    public void instrumentHasBuyingPrice(){
        assertEquals(100.00, guitar1.getBuyingPrice(), 0.0);
    }

    @Test
    public void instrumentHasSellingPrice(){
        assertEquals(200.00, guitar1.getSellingPrice(), 0.0);
    }

    @Test
    public void instrumentHasANumberOfStrings(){
        assertEquals(6, guitar1.getNumberOfStrings());
    }

    @Test
    public void canBePlayed(){
        assertEquals("sweet, sweet licks", guitar1.play());
    }

}