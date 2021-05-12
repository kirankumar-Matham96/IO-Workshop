package comMultiThreads;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        CharacterThread characterThread = new CharacterThread();//initializing characterThread
        characterThread.start();//starting characterThread
         characterThread.setPriority(1);//setting priority to thread
        NumberThread numThread = new NumberThread();//initializing numberThread
        Thread numberThread = new Thread(numThread);//will create a new thread and runs it

        /**
         * Setting thread as Daemon.
         * So, the java VM will exit when only daemon thread is running.
         * (stops the execution when there is no other thread (except daemon thread) is running)
         */
        numberThread.setDaemon(true);//setting thread as Daemon.(so the java VM will exit when only daemon thread is running)
        numberThread.start();//starting the thread
         numberThread.setPriority(2);//setting priority to thread
    }
}
