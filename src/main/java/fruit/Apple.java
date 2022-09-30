package fruit;

public class Apple implements Fruit {

    private AppleType type;
    private int weightInGrams;
    private int pricePerPoundInCents;

    public Apple(AppleType type, int weightInGrams, int pricePerPoundInCents) {
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

    public AppleType getType() {
        return type;
    }

    public void setType(AppleType type) {
        this.type = type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public int getPricePerPoundInCents() {
        return pricePerPoundInCents;
    }

    public void setPricePerPoundInCents(int pricePerPoundInCents) {
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

    @Override
    public int getWeightInOunces() {
        return (int) Math.round(this.weightInGrams / 28.3495);
    }

    @Override
    public int getPriceInCents() {
        return (int) Math.round(this.pricePerPoundInCents * (this.weightInGrams * 0.0022));
    }
}