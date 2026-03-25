package formas;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(); 
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
    }
}
