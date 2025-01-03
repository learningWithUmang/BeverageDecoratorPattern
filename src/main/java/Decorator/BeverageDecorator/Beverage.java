package Decorator.BeverageDecorator;

public abstract class Beverage {
    public abstract double getCost();
    public void getDescription(){
        System.out.println("Beverage description: - ");
    }
}
