public class HiloMainRunnable {
    MiRunnable miRunnable = new MiRunnable();
    Thread hilo = new Thread(miRunnable);

    hilo.start();
}
