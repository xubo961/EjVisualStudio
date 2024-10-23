public class Bicicleta1 extends Vehiculo{
    private String tipoBicicleta;

    public Bicicleta1(int velocidadMaxima, String marca, String tipoBicicleta){
        super(velocidadMaxima, marca);
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public String toString() {
        return super.toString() + "TipoBicicleta: " + tipoBicicleta;
    }

}