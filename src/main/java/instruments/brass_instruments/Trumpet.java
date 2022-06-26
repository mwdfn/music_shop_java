package instruments.brass_instruments;

import instruments.InstrumentType;

public class Trumpet extends BrassInstrument{
    public Trumpet(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, numberOfValves);
    }
}
