package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo implements Runnable{

    public static CountDownLatch countDownLatch = new CountDownLatch(4);

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "run");
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new CountDownLatchDemo());
            thread.start();
        }

        // main Thread wait
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "run");
    }
}
