package producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer_Test {
    private static final int MAX_CAPACITY = 10;
    private static List<Object> goods = new ArrayList<Object>();

    public static void main(String[] args) {
        (new ProducerThread()).start();
        (new ConsumerThread()).start();
    }


    static class ProducerThread extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (goods) {
                    if (goods.size() == MAX_CAPACITY) {
                        System.out.println("Store full, waiting");
                        try {
                            goods.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    goods.add(new Object());
                    System.out.println("Produce goods, total :" + goods.size());

                    goods.notifyAll();
                }
            }
        }
    }

    static class ConsumerThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (goods) {
                    if (goods.size() == 0) {
                        System.out.println("No goods, waiting..");
                        try {
                            goods.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    goods.remove(0);
                    System.out.println("Consume goods, total:" + goods.size());

                    goods.notifyAll();
                }
            }
        }
    }
}
















