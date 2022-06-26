package people.staff;

public class ShopAssistant extends Staff{

    private double bonus;

    public ShopAssistant(String name, int age, String sex, String jobTitle, double bonus) {
        super(name, age, sex, jobTitle);
        this.bonus = bonus;
    }
}
