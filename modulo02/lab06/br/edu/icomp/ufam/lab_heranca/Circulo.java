package br.edu.icomp.ufam.lab_heranca;

import java.util.Locale;

public class Circulo extends FormaGeometrica {
    public double raio;

    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
            "Círculo na posição (%d, %d) com raio de %.1fcm (área=%.14fcm2, perímetro=%.14fcm)",
            posX, posY, raio, getArea(), getPerimetro());
    }
}
