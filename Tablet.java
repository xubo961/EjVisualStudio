public class Tablet extends Dispositivos implements Conectable{
    public void encender () {
        this.estado = true;
        System.out.println("Tablet encendiendose");
    }

    public void conectarWifi () {
        System.out.println("Tablet conectadose al WIFI");
    }

    public void desconectarWifi () {
        System.out.println("Tablet desconectadose al WIFI");
    }
}
