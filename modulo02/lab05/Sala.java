package Escola;
public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    // Construtor padrão
    public Sala() {
        this(0, 0, 0, false);
    }

    // Construtor com todos os atributos
    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    // Método getDescricao
    public String getDescricao() {
        return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, " + 
               (acessivel ? "acessível" : "não acessível") + ")";
    }
}
