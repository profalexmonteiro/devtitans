package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException {
	
    public CoordenadaNegativaException() {
        super("Coordenada com valor negativo");
    }

    public CoordenadaNegativaException(String men) {
        super(men);
    }

}
