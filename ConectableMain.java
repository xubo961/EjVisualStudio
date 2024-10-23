public class ConectableMain {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();
        Ordenador ordenador = new Ordenador();

        telefono.encender();
        telefono.apagar();

        ordenador.encender();
        ordenador.apagar();

        System.out.println();
    }
}
