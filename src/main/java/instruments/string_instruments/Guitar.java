package instruments.string_instruments;

import instruments.InstrumentType;

public class Guitar extends StringInstrument {

    public Guitar(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice, int stringNumber) {
        super(name, family, material, buyingPrice, sellingPrice, stringNumber);
    }


}
