package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
    public double largura;
    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return String.format(
            "Retângulo na posição (%d, %d) com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)",
            posX, posY, largura, altura, getArea(), getPerimetro()
        );
    }
}
