import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportarAlumnoMain {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos = readFileTXT(alumnos);


        for(Alumno alumno: alumnos) {
            System.out.println(alumno.toString());
        }

        try {
            File texto = new File("alumnos.txt");
            Scanner leer = new Scanner(texto);
            while (leer.hasNextLine()) {
              String datos = leer.nextLine();
              System.out.println(datos);
            }
            leer.close();
          } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
          }
    }
}