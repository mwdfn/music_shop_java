package instruments.brass_instruments;

import behaviours.IPlay;
import instruments.InstrumentType;

public class Trumpet extends BrassInstrument implements IPlay {
    public Trumpet(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, numberOfValves);
    }

    public String play(){
        return "trumpet, trumpet, trumpet";
    }
}
