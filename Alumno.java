public class Alumno {
    private String Nombre;
    private int Edad;
    private String Curso;
    private double NotaMedia;
    


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getCurso() {
        return Curso;
    }
    public void setCurso(String curso) {
        Curso = curso;
    }
    public double getNotaMedia() {
        return NotaMedia;
    }
    public void setNotaMedia(double notaMedia) {
        NotaMedia = notaMedia;
    }

    
    public Alumno(String nombre, int edad, String curso, double notaMedia) {
        Nombre = nombre;
        Edad = edad;
        Curso = curso;
        NotaMedia = notaMedia;
    }


    @Override
    public String toString() {
        return "Alumno [toString()=" + super.toString() + "]";
    }

}
