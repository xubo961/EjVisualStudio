import javax.imageio.IIOException;
import java.io.*;

public class LeerEntrada {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\entrada.txt");
        if (isExists(file)) {
            leerArchivoFile();
        }
    }

    public static boolean isExists(File file) {
        return file.exists();
    }

    public static long getBits(long fileLength) {
        return fileLength * 8;
    }

    public static void leerArchivoFile() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\ALUMNO\\Desktop\\AccesoDatos\\entrada.txt");

            int byteLeido;
            while ((byteLeido = fis.read()) != 1) {
                System.out.println((char)byteLeido);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

