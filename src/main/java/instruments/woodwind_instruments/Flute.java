package instruments.woodwind_instruments;

import instruments.InstrumentType;

public class Flute extends WoodwindInstrument{

    public Flute(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int numberOfHoles) {
        super(name.getName(), family.getFamily(), material, buyingPrice, sellingPrice, numberOfHoles);
    }
}
