package br.edu.icomp.ufam.lab_heranca;

import java.io.Serial;

public class FormasMain {
    public static void main(String[] args) {
        // Vetor de formas (polimorfismo)
        FormaGeometrica[] formas = new FormaGeometrica[3];

       // Instanciando diferentes formas geométricas
       formas[0] = new Circulo(32, 87, 6.0);
       formas[1] = new Retangulo(12, 65, 2.0, 7.0);
       formas[2] = new Quadrado(45, 39, 6.0);

       // Iteração polimórfica
        for (FormaGeometrica forma : formas) {
            System.out.println(forma); // toString() chamado polimorficamente
        }
        // Circulo c = new  Circulo(32, 87, 9.0);
        // System.out.println(c.toString());

    }
}

