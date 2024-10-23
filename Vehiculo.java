public class Vehiculo {
    protected int velocidadMaxima;
    protected String marca;

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(int velocidadMaxima, String marca) {
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "VelocidadMáxima: " + velocidadMaxima + "Marca: " + marca;
    }

}
