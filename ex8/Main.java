package formas;

public class Main {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo(5, 3);
        Circulo circ = new Circulo(2);

        
        System.out.println("=== Retângulo ===");
        ret.calcularArea();
        ret.calcularPerimetro();
        ret.mostrarResultados();

        
        System.out.println("\n=== Círculo ===");
        circ.calcularArea();
        circ.calcularPerimetro();
        circ.mostrarResultados();

        
        FormaGeometrica[] formas = new FormaGeometrica[2];
        formas[0] = ret;
        formas[1] = circ;

        System.out.println("\n=== Teste Polimorfismo ===");
        for (FormaGeometrica f : formas) {
            f.calcularArea();
            f.calcularPerimetro();
            f.mostrarResultados();
            System.out.println("---");
        }
    }
}
