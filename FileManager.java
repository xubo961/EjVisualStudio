import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    public String Ruta;
    ArrayList<Figura> arrayFiguras;

    public FileManager() {

    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }

    public FileManager(String ruta, ArrayList<Figura> arrayFiguras) {
        Ruta = ruta;
        this.arrayFiguras = arrayFiguras;
    }


    public FileManager(String string) {
        //TODO Auto-generated constructor stub
    }

    public boolean exists() {
        File file = new File(Ruta);
        if (file.exists())
            return true;
        else
            return false;
    }



}

