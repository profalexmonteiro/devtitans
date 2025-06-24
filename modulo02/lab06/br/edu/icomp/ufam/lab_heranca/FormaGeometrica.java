package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
    public int posX;
    public int posY;

    // Construtor
    public FormaGeometrica(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    // Método que retorna a posição como String
    public String getPosString() {
        return "posição (" + posX + ", " + posY + ")";
    }

    // Métodos abstratos
    public abstract double getArea();

    public abstract double getPerimetro();
}
