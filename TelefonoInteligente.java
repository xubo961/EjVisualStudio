public class TelefonoInteligente extends Dispositivos implements Conectable{
    public void encender () {
        this.estado = true;
        System.out.println("Telefono encendiendose");
    }

    public void conectarWifi () {
        System.out.println("Telefono conectadose al WIFI");
    }

    public void desconectarWifi () {
        System.out.println("Telefono desconectadose al WIFI");
    }

    @Override
    public String toString() {
        return "La marca del TeléfonoInteligente es: " + marca;
    }
    
}
