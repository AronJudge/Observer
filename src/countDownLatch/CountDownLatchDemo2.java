package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        Waiter waiter = new Waiter(latch);
        Waiter2 waiter2 = new Waiter2(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter).start();
        new Thread(waiter2).start();
        new Thread(decrementer).start();

        Thread.sleep(1000);
    }


    public static class Waiter implements Runnable {

        CountDownLatch latch = null;

        public Waiter(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                latch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Waiter Released");
        }
    }

    public static class Waiter2 implements Runnable {

        CountDownLatch latch = null;

        public Waiter2(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                latch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Waiter2 Released");
        }
    }

    public static class Decrementer implements Runnable {

        CountDownLatch latch = null;

        public Decrementer(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                this.latch.countDown();

/*                Thread.sleep(1000);
                this.latch.countDown();

                Thread.sleep(1000);
                this.latch.countDown();*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
