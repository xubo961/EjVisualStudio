import java.util.Scanner;

public abstract class Dispositivos {
    
    protected boolean estado;
    protected String marca;

    public abstract void encender();

    public Dispositivos() {
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del TeléfonoInteligente que tiene: ");
        this.marca = scanner.nextLine();
        
        scanner.close();
    }

    

    
}
