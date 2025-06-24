public class Proprietario {
    // Atributos públicos conforme diagrama
    public String nome;
    public int cnh;
    public int anoNascimento;

    // Construtor padrão com encadeamento
    public Proprietario() {
        this("Sem nome", 0, 1900);
    }

    // Construtor com parâmetros
    public Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    // Método que retorna a idade com base no ano de referência
    public int getIdade(int anoReferencia) {
        return anoReferencia - anoNascimento;
    }

    // Método que retorna a descrição no formato especificado
    public String getDescricao() {
        return "Proprietario: nome=" + nome + ", cnh=" + cnh + ", anoNascimento=" + anoNascimento + ".";
    }
}
