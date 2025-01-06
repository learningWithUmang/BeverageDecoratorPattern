package ObserverDesignPattern;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    //Weather Data => pressure, temperature, humidity
}
