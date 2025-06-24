package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;

    public Caminho(int maxTam) {
        this.caminho = new Coordenada[maxTam];
        this.tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        // Regra 1: tamanho excedido
        if (tamanho >= caminho.length) {
            throw new TamanhoMaximoExcedidoException();
        }

        // Regra 2: distância entre pontos > 15
        if (tamanho > 0) {
            double dist = caminho[tamanho - 1].distancia(coordenada);
            if (dist > 15.0) {
                throw new DistanciaEntrePontosExcedidaException();
            }
        }

        caminho[tamanho] = coordenada;
        tamanho++;
    }

    public void reset() {
        for (int i = 0; i < caminho.length; i++) {
            caminho[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do caminho:\n");
        sb.append("- Quantidade de pontos: ").append(tamanho).append("\n");
        sb.append("- Pontos:\n");
        for (int i = 0; i < tamanho; i++) {
            sb.append("-> ").append(caminho[i].toString()).append("\n");
        }
        return sb.toString();
    }
}

