package instruments.woodwind_instruments;

import behaviours.IPlay;
import instruments.InstrumentType;

public class Flute extends WoodwindInstrument implements IPlay {

    public Flute(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int numberOfHoles) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, numberOfHoles);
    }

    public String play(){
        return "imagine some olde English scene, right.";
    }
}
