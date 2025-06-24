package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {

    public CarroLuxuoso(String placa) {
        super(placa);
    }

    @Override
    public Posicao getPosicao() {
        Random r = new Random();
        double latitude = -3.160000 + (-2.960000 + 3.160000) * r.nextDouble();
        double longitude = -60.120000 + (0.300000) * r.nextDouble(); // -60.120 a -59.820
        double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();
        return new Posicao(latitude, longitude, altitude);
    }

    @Override
    public double getErroLocalizacao() {
        return 15.0;
    }
}

