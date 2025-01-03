package Decorator.BeverageDecorator;

public class Client {
    public static void main(String[] args) {
        Beverage decaf = new DeCaf();

        decaf.getDescription();
        System.out.println(decaf.getCost());

        decaf = new Milk(decaf);
        decaf.getDescription();
        System.out.println(decaf.getCost());

        decaf = new Mocha(decaf);
        decaf.getDescription();
        System.out.println(decaf.getCost());



        Beverage beverage = new ChocoChip(new Milk(new Mocha(new ChocoChip(new HouseBlend()))));
        beverage.getDescription();
        System.out.println(beverage.getCost());


//        Beverage beverage = new HouseBlend();
//        beverage.getDescription();
    }
}
