public class Circulo extends Figura {

    private int radio;
    private String color;
    
    public Circulo() {

    }

    public Circulo(int radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área de un círculo es de : " + area);
    }

    public void calcularPerimetro() {
        double perimetro = Math.PI * Math.PI * radio;
        System.out.println("El períemtro de un círculo es de: " + perimetro);
    }
}
