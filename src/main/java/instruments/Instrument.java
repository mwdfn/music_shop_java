package instruments;

public abstract class Instrument {

    private InstrumentType name;
    private InstrumentType family;
    private String material;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstrumentType name, InstrumentType family, String material, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.family = family;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}
