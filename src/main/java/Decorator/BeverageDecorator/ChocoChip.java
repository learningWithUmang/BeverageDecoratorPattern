package Decorator.BeverageDecorator;

public class ChocoChip extends AddOn{
    private Beverage currentBeverage;
    ChocoChip(Beverage currentBeverage){
        this.currentBeverage = currentBeverage;
    }
    @Override
    public double getCost() {
        return 10 + currentBeverage.getCost();
    }

    @Override
    public void getDescription() {
        currentBeverage.getDescription();
        System.out.println("Added chocochip");
    }
}
