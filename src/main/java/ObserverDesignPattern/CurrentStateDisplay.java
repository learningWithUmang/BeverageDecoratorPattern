package ObserverDesignPattern;

public class CurrentStateDisplay implements Observer, Display{
    private double pressure;
    private double temp;
    private double humidity;

    @Override
    public void display() {
        System.out.println("displaying current state of weather : - ");
        System.out.println("Pressure : " + pressure);
        System.out.println("Humidity : " + humidity);
        System.out.println("Temperature : " + temp);
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
