public class Coche extends Vehiculo{
    private int capacidadCombustible;
    
    public Coche(int velocidadMaxima, String marca, int capacidadCombustible) {
        super(velocidadMaxima, marca);
        this.capacidadCombustible = capacidadCombustible;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando....");
    }
    
    @Override
    public String toString() {
        return super.toString() + "CapacidadCombustible: " + capacidadCombustible;
    }

}
