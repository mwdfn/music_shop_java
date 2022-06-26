package instruments.string_instruments;

import instruments.Instrument;
import instruments.InstrumentType;

public class StringInstrument extends Instrument {

    private int stringNumber;

    public StringInstrument(String name, String family, String material, double buyingPrice, double sellingPrice, int stringNumber) {
        super(name, family, material, buyingPrice, sellingPrice);
        this.stringNumber = stringNumber;
    }

    public int getNumberOfStrings() {
        return stringNumber;
    }
}
