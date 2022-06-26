package instruments.brass_instruments;

import behaviours.IPlay;
import instruments.InstrumentType;

public class FrenchHorn extends BrassInstrument implements IPlay {
    public FrenchHorn(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, numberOfValves);
    }

    public String play(){
        return "french horn noises";
    }
}
