package ObserverDesignPattern;

public class ForeCastDisplay implements Observer, Display{
    private double pressure;
    private double temp;
    private double humidity;

    @Override
    public void display() {
        System.out.println("displaying forecast of weather : - ");

        if(temp > 80){
            System.out.println("Forecast  : A very hot weather");
        }else if(temp < 30){
            System.out.println("Forecast : Normal weather");
        }else{
            System.out.println("Forecast: Cold weather");
        }
    }

    @Override
    public void update(double pressure, double temp, double humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;

        //update display
        display();
    }
}
