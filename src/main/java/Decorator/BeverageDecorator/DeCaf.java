package Decorator.BeverageDecorator;

public class DeCaf extends Beverage{
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Decaf");
    }
}
