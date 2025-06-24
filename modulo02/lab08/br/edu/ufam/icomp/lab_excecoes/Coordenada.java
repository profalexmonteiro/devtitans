package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX;
    private int posY;
    private int digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
        // Regra 1: coordenadas negativas
        if (posX < 0 || posY < 0) {
            throw new CoordenadaNegativaException();
        }

        // Regra 2: fora dos limites
        if (posX > 30000 || posY > 30000) {
            throw new CoordenadaForaDosLimitesException();
        }

        // Regra 3: digito inválido
        if ((posX + posY) % 10 != digito || digito < 0 || digito > 9) {
            throw new DigitoInvalidoException();
        }

        this.posX = posX;
        this.posY = posY;
        this.digito = digito;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public double distancia(Coordenada coordenada) {
        int dx = this.posX - coordenada.posX;
        int dy = this.posY - coordenada.posY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return posX + ", " + posY;
    }
}
