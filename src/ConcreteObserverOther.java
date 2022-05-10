public class ConcreteObserverOther implements Observer{

    private String observerName;


    public ConcreteObserverOther(String observerName) {
        this.observerName = observerName;
    }
    @Override
    public void update() {
        System.out.println(observerName + "i got update my state");
    }
}
