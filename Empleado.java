public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected int bono;

    public abstract void calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre, double salarioBase, int bono) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

}
