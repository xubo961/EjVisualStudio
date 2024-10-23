public class Rectangulo extends Figura{

    private int base;
    private int altura;
    private String color;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calcularArea() {
        int area = base * altura;
        System.out.println("El área de un rectángulo es de: " + area);
    }

    public void calcularPerimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("El perímetro de un rectángulo es de: " + perimetro);

    }
}
