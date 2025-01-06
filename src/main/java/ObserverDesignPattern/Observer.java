package ObserverDesignPattern;

public interface Observer {
    void update(double pressure, double temp, double humidity);
    //10 displays => new state of the subject
}
