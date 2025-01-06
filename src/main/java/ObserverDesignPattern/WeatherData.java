package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double humidity;
    private double temperature;
    private double pressure;
    private List<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(pressure, temperature, humidity);
        }
    }

    public void setMeasurements(double pressure, double temperature, double humidity){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;

        notifyObservers();
    }
}
