import java.io.File;

public class FicherosMain {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\Fichero.txt");
            if (file.createNewFile()) {
                System.out.println("Se ha creado el fichero");
            }
            else {
                System.out.println("Ya hay un fichero creado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
