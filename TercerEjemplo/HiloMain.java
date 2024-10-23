package TercerEjemplo;

public class HiloMain {
    Thread hilo1 = new Thread(() -> {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hilo 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error " + e);
            }
        }
    });

    Thread hilo2 = new Thread(() -> {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hilo 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error " + e);
            }
        }
    });

    hilo1.start();
    hilo2.start();

    try {
        hilo1();
        hilo2();
    }
    catch (InterruptedException e) {
        System.out.println("Error " + e);
    }

}
