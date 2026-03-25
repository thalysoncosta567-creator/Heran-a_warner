package pessoas;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void falar() {
        System.out.println("Olá, meu nome é " + nome + " e ensino " + disciplina + ".");
    }
}
