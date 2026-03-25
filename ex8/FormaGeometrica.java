package formas;

public class FormaGeometrica {
    protected double area;
    protected double perimetro;

    public FormaGeometrica() {
        this.area = 0;
        this.perimetro = 0;
    }

    public void calcularArea() {
        System.out.println("Cálculo de área genérico.");
    }

    public void calcularPerimetro() {
        System.out.println("Cálculo de perímetro genérico.");
    }

    public void mostrarResultados() {
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
