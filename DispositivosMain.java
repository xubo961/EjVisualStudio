

public class DispositivosMain {
    public static void main(String[] args) {

        TelefonoInteligente telefonoInteligente = new TelefonoInteligente();
        telefonoInteligente.encender();
        telefonoInteligente.conectarWifi();
        telefonoInteligente.desconectarWifi();

        Tablet tablet = new Tablet();
        tablet.encender();
        tablet.conectarWifi();
        tablet.desconectarWifi();
       
        telefonoInteligente.setMarca();
        System.out.println(telefonoInteligente.toString());


    }

}
