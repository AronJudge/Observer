public class NotifyMain {
    public static void main(String[] args) {
        Student student = new CreateSubject();

        Observer observer = new ConcreteSubject("Observer one");

        Observer observer1 = new ConcreteObserverOther("Observer two");

        student.attach(observer);

        student.attach(observer1);

        student.notifyObserver();
    }
}
