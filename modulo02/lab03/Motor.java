public class Motor {
    // Atributos públicos conforme o diagrama
    public int tipo;
    public double capacidade;
    public int potencia;

    // Construtor padrão
    public Motor() {
        this(0, 1.0, 80); // valores padrão
    }

    // Construtor com parâmetros e encadeamento
    public Motor(int tipo, double capacidade, int potencia) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    // Retorna o tipo do motor como String
    public String getTipoString() {
        switch (tipo) {
            case 1: return "Gasolina";
            case 2: return "Alcool";
            case 3: return "Flex";
            case 4: return "Diesel";
            case 5: return "Eletrico";
            default: return "Outros";
        }
    }

    // Retorna a descrição formatada
    public String getDescricao() {
        return "Motor: tipo=" + getTipoString() +
               ", capacidade=" + String.format("%.1f", capacidade) + "L" +
               ", potencia=" + potencia + "CV.";
    }
}
