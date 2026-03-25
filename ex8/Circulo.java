package formas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * raio * raio;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * raio;
    }
}
