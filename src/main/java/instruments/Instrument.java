package instruments;

public abstract class Instrument {

    private String name;
    private String family;
    private String material;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String name, String family, String material, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.family = family;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getInstrumentName() {
        return name;
    }

    public String getInstrumentFamily() {
        return family;
    }

    public String getInstrumentMaterial() {
        return material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
