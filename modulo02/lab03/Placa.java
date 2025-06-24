public class Placa {
    // Atributos públicos conforme o diagrama
    public String placa;
    public int tipo;

    // Construtor padrão
    public Placa() {
        this("AAA-0000", 0); // valores padrão
    }

    // Construtor parametrizado com encadeamento
    public Placa(String placa, int tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    // Método que retorna o tipo da placa como String
    public String getTipoString() {
        switch (tipo) {
            case 1: return "Normal";
            case 2: return "Servico";
            case 3: return "Oficial";
            case 4: return "Auto Escola";
            case 5: return "Prototipo";
            case 6: return "Colecionador";
            default: return "Outros";
        }
    }

    // Método que retorna true para tipo 2 ou 3, caso contrário false
    public boolean temEstacionamentoLivre() {
        return tipo == 2 || tipo == 3;
    }

    // Método que retorna a descrição no formato especificado
    public String getDescricao() {
        return "Placa: placa=" + placa +
               ", tipo=" + getTipoString() +
               ", estacionamentoLivre=" + temEstacionamentoLivre() + ".";
    }
}
