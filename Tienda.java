import java.util.ArrayList;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto ("Arroz", 8.56, 28));
        productos.add(new Producto ("Harina", 3.27, 15));
        productos.add(new Producto ("Espagueti", 10.36, 10));
        productos.add(new Producto ("Mantequilla", 25.31, 59));
        productos.add(new Producto ("Aguacate", 33.33, 36));
    
        System.out.println(productos.toString());

        


 

    }
    
}
