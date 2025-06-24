package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Locale;

public class Posicao{
    private double latitude;
    private double longitude;
    private double altitude;

    public Posicao(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                        "Posição: %.6f, %.6f, %.1f", latitude, longitude, altitude);
    }
}
