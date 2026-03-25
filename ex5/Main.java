package pessoas;

public class Main {
    public static void main(String[] args) {
        // Array de Pessoas mostrando polimorfismo
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("Thalyson", 19);
        pessoas[1] = new Aluno("Ana", 20, "Engenharia da Computação");
        pessoas[2] = new Professor("Warner", 50, "Java");

        for (Pessoa p : pessoas) {
            p.falar(); 
        }
    }
}
