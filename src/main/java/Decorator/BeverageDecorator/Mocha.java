package Decorator.BeverageDecorator;

public class Mocha extends AddOn{
    private Beverage currentBeverage;
    Mocha(Beverage currentBeverage){
        this.currentBeverage = currentBeverage;
    }
    @Override
    public double getCost() {
        return 36 + currentBeverage.getCost();
    }

    @Override
    public void getDescription() {
        currentBeverage.getDescription();;
        System.out.println("Added mocha");
    }
}
