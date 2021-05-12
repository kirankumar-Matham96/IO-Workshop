package comMultiThreads;

/**
 * prints numbers
 */
public class NumberThread implements Runnable {
    public void run() {

        /**
         * prints the numbers from 1 to 90
         */
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);//sleeps 200 m.sec after printing every character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
