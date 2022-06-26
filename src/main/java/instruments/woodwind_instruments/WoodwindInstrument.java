package instruments.woodwind_instruments;

import instruments.Instrument;

public abstract class WoodwindInstrument extends Instrument {

    private int numberOfHoles;

    public WoodwindInstrument(String name, String family, String material, double buyingPrice, double sellingPrice, int numberOfHoles) {
        super(name, family, material, buyingPrice, sellingPrice);
        this.numberOfHoles = numberOfHoles;
    }
}
