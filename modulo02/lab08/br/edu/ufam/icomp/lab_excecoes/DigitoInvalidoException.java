package br.edu.ufam.icomp.lab_excecoes;

public class DigitoInvalidoException extends RoverCoordenadaException {
	
    public DigitoInvalidoException() {
        super("Digito da coordenada inválido");
    }

    public DigitoInvalidoException(String men) {
        super(men);
    }

}
