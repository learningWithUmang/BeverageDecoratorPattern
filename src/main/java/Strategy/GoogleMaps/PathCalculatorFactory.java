package Strategy.GoogleMaps;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode travelMode){
        if(travelMode.equals(TravelMode.BIKE)){
            return new BikePathCalculator();
        }else if(travelMode.equals(TravelMode.CAR)){
            return new CarPathCalculator();
        }else if(travelMode.equals(TravelMode.WALK)){
            return new WalkPathCalculator();
        }else{
            //default strategy
            return new CarPathCalculator();
        }
    }
}
