package ObserverDesignPattern;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentStateDisplay currentStateDisplay = new CurrentStateDisplay();
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay();
        weatherData.registerObserver(currentStateDisplay);
        weatherData.registerObserver(foreCastDisplay);

        weatherData.setMeasurements(80, 20, 10);

        System.out.println();
        weatherData.setMeasurements(100, 10, 10);

        weatherData.removeObserver(foreCastDisplay);

        System.out.println();
        weatherData.setMeasurements(1200, 200, 100);

        System.out.println();


    }
}
