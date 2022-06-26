package instruments.string_instruments;

import behaviours.IPlay;
import instruments.InstrumentType;

public class Guitar extends StringInstrument implements IPlay {

    public Guitar(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int stringNumber) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, stringNumber);
    }

    public String play(){
        return "sweet, sweet licks";
    }
}
