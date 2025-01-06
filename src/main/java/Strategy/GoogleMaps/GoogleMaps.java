package Strategy.GoogleMaps;

public class GoogleMaps {
    public void findPath(String from, String to, TravelMode travelMode){
//        if(travelMode == TravelMode.BIKE){
//            //algorithm for bike
//            System.out.println("Calculate for bike");
//        }else if(travelMode == TravelMode.CAR){
//            //algorithm for car
//            System.out.println("Calculate for car");
//        }else if(travelMode == TravelMode.WALK){
//            //algorithm for walk
//            System.out.println("Calculate for walk");
//        }

//        PathCalculatorStrategy pathCalculatorStrategy;
//        if(travelMode == TravelMode.BIKE){
//            pathCalculatorStrategy = new BikePathCalculator();
//        }else if(travelMode == TravelMode.CAR){
//            pathCalculatorStrategy = new CarPathCalculator();
//        }else if(travelMode == TravelMode.WALK){
//            pathCalculatorStrategy = new WalkPathCalculator();
//        }else{
//            //default strategy
//            pathCalculatorStrategy = new CarPathCalculator();
//        }

        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorStrategy(travelMode);

        pathCalculatorStrategy.findPath(from, to);
    }
}
