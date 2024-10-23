public class Programador extends Empleado implements Autenticable, Bonificable {
    
    public Programador(String nombre, double salarioBase, int bono) {
        super(nombre, salarioBase, bono);
        //TODO Auto-generated constructor stub
    }

    public void iniciarSesion(){
        System.out.println("Iniciando sesión... ");
    }

    public void cerrarSesion() {
        System.out.println("Cerrando sesión... ");
    }

    public void calcularBono() {
        System.out.println("Calculando bono... ");
    }

    public void calcularSalario() {
        System.out.println("Calculando salario... ");
    }
}
