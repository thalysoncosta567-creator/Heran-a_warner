package pessoas;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void falar() {
        System.out.println("Meu nome é " + nome + " e estudo " + curso + ".");
    }
}
