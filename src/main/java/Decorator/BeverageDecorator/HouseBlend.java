package Decorator.BeverageDecorator;

public class HouseBlend extends Beverage{
    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Houseblend");
    }
}
