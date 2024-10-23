public class Cuadrado extends Figura {

    private int lado;
    private String color;

    public Cuadrado() {

    }

    public Cuadrado(int lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calcularArea() {
        int area = lado * lado;
        System.out.println("El área de un cuadrado es: " + area);
    }

        public void calcularPerimetro() {
            int perimetro = lado * 4;
            System.out.println("El perímetro de un cuadrado es: " + perimetro);
        }
}
