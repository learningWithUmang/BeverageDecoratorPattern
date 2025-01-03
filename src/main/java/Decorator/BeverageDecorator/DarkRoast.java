package Decorator.BeverageDecorator;

public class DarkRoast extends Beverage{

    @Override
    public double getCost() {
        return 120;
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
    }
}
