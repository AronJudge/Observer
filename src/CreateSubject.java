
public class CreateSubject extends Student{


    @Override
    public void notifyObserver() {
        System.out.println("object has changed, send notify to observers");

        for (Object object : observers) {
            ((Observer)object).update();
        }
    }
}
