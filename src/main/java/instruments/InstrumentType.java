package instruments;

public enum InstrumentType {

    STRING1("guitar", "string"),
    STRING2("banjo", "string"),
    WOODWIND1("flute", "woodwind"),
    BRASS1("trumpet", "brass"),
    BRASS2("french horn", "brass");

    private final String name;
    private final String family;

    InstrumentType(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
