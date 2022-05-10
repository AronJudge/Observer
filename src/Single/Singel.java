package Single;

public class Singel {


    private Singel() {

    }

    private static Singel singel;

    public static Singel getInstance() {
        if (null == singel) {
            synchronized (singel.getClass()) {
                if (null == singel) {
                    singel= new Singel();
                }
            }
        }
        return singel;
    }


}
