public class GerenteMain {
    
public static void main(String[] args) {
    
        Gerente gerente = new Gerente ("Laura", 5000, 2000);
        Programador programador = new Programador("Carlos", 3000, 3000);
        gerente.iniciarSesion();
        programador.iniciarSesion();
    
        System.out.println("\nInformacion del gerente: ");;
        gerente.mostrarInformacion();
    
        System.out.println("\nInformacion del programador: ");;
        programador.mostrarInformacion();
    
        gerente.cerrarSesion();
        programador.cerrarSesion();
    
}

}
