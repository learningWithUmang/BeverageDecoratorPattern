package Decorator.BeverageDecorator;

public class Milk extends AddOn{
    private Beverage currentBeverage;
    Milk(Beverage currentBeverage){
        this.currentBeverage = currentBeverage;
    }
    @Override
    public double getCost() {
        return 25 + currentBeverage.getCost();
    }

    @Override
    public void getDescription() {
        currentBeverage.getDescription();
        System.out.println("Added milk");
    }
}
