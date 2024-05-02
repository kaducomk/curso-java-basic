package escola;

/**
 * Aluno
 */
public class Aluno {
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
