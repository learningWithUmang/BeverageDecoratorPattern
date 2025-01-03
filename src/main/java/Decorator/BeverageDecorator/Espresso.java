package Decorator.BeverageDecorator;

public class Espresso extends Beverage{
    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Espresso");
    }
}
