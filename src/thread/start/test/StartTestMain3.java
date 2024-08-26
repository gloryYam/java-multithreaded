package thread.start.test;

import static util.MyLogger.log;

public class StartTestMain2 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable, "counter");
        thread1.start();
    }
}
