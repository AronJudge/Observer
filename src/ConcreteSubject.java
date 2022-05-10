public class ConcreteSubject implements Observer{

    private String observerName;

    public ConcreteSubject(String observerName) {
        this.observerName = observerName;
    }
    @Override
    public void update() {
        System.out.println(observerName + "i got update my state");
    }
}
