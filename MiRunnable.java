public class MiRunnable implements Runnable{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Runnable hilo " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e);
        }
    }
}
