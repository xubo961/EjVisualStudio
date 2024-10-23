import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TrabajandoConFicheros {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\alumnos.txt");

        if (isExists(archivo)) {
            long bits = getBits(archivo.length());

            FileInputStream fis = null;
            try {
                fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\alumnos.txt");

                int byteLeido;
                while (byteLeido = fis.read()) != -1 {
                    System.out.println();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public class TrabajandoConFicheros {
        public static void leerArchivoFileinputStream() {
            int byteLeido;
            while (byteLeido = fis ) {
                
            }
        }
        
    }

    public static void EscribirArchivoFileInputStream() {
        FileOutputStream fos = null;

        try {
             fos = new FileOutputStream("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\alumnos.txt")
             String contenido = "Hola Mundo";

             byte[] byteContenido = contenido
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
