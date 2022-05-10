import java.util.ArrayList;

public abstract class Student {

    protected ArrayList observers = new ArrayList<>();

    // put observer in list<observer>
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // delete observers in list<observer>
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // make abstract fun
    public abstract void notifyObserver();

}
