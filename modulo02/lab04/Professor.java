public class Professor {
    String titulacao;
    String nome;
    int matricula;

    // Construtor padrão
    public Professor() {}

    // Construtor com parâmetros
    public Professor(String titulacao, String nome, int matricula) {
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    // Método que retorna a descrição formatada
    public String getDescricao() {
        return "Prof. " + this.titulacao + " " + this.nome + " - mat " + this.matricula;
    }
}
