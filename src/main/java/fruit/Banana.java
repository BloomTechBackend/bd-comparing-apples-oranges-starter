package fruit;

public class Banana implements Fruit {
    private int weightInOunces;
    private int pricePerPoundInCents;

    public Banana(int weightInOunces, int pricePerPoundInCents) {
        this.weightInOunces = weightInOunces;
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

    public int getWeightInOunces() {
        return weightInOunces;
    }

    @Override
    public int getPriceInCents() {
        return (int) Math.round(this.pricePerPoundInCents * (this.weightInOunces / 16.0));
    }

    public void setWeightInOunces(int weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public int getPricePerPoundInCents() {
        return pricePerPoundInCents;
    }

    public void setPricePerPoundInCents(int pricePerPoundInCents) {
        this.pricePerPoundInCents = pricePerPoundInCents;
    }

}