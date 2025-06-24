package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        Caminho caminho = new Caminho(10);

        try {
            // Coordenadas válidas
            Coordenada c1 = new Coordenada(10, 10, 0);
            Coordenada c2 = new Coordenada(15, 15, 0);
            Coordenada c3 = new Coordenada(20, 20, 0);

            // Coordenada inválida (exemplo de exceção de distância excedida)
            Coordenada c4 = new Coordenada(100, 100, 0);

            caminho.addCoordenada(c1);
            caminho.addCoordenada(c2);
            caminho.addCoordenada(c3);
            caminho.addCoordenada(c4); // Deve lançar exceção

        } catch (RoverException e) {
            System.out.println("Erro detectado: " + e.getMessage());
            caminho.reset();
        }

        // Impressão do caminho final
        System.out.println(caminho);
    }
}
