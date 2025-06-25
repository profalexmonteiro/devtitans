import java.util.Calendar;

public class Aluno {
    public String nome;
    public int matricula;
    public int anoNascimento;

    // Construtor padrão
    public Aluno() {
        this("Sem nome", 0, 2000); // valores padrão
    }

    // Construtor com nome
    public Aluno(String nome) {
        this(nome, 0, 2000);
    }

    // Construtor com nome e matrícula
    public Aluno(String nome, int matricula) {
        this(nome, matricula, 2000);
    }

    // Construtor com todos os atributos
    public Aluno(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular idade
    public int getIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    // Método para retornar a descrição completa
    public String getDescricao() {
        return nome + " (mat=" + matricula + ", idade=" + getIdade() + ")";
    }

}
