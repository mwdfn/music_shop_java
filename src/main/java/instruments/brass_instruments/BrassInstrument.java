package instruments.brass_instruments;

import instruments.Instrument;

public abstract class BrassInstrument extends Instrument {

    private int numberOfValves;

    public BrassInstrument(String name, String family, String material, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(name, family, material, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }
}
