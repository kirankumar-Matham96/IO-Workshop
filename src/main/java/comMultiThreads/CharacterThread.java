package comMultiThreads;

/**
 * prints characters
 */
public class CharacterThread extends Thread {
    public void run() {

        /**
         * prints the chars whose ASCII values are between 65 to 90
         */
        for (char i = 65; i <= 90; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);//sleeps 200 m.sec after printing every character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





