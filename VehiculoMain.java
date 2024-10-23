import java.util.ArrayList;

public class VehiculoMain {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
            vehiculos.add(new Coche(180, "TOYOTA", 200));
            vehiculos.add(new Coche(200, "AUDI", 250));

            vehiculos.add(new Bicicleta1(50, "DUOTTS", "MONTAÑA"));
            vehiculos.add(new Bicicleta1(60, "BUGATTI", "CAMINAR"));

            System.out.println("VEHICULOS:");
            for (int i = 0; i < vehiculos.size(); i++) {
                System.out.println(vehiculos.get(i).toString());
            }
    }
}
