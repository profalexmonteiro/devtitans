package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void teste(String[] args) {
        
        //Cria objetos que implementam Localizavel
        Localizavel[] vetorLocalizaveis = new Localizavel[3];
        
        vetorLocalizaveis[0] = new Celular(55, 92, 991234567);
        vetorLocalizaveis[1] = new CarroLuxuoso("NOP-1234");
        vetorLocalizaveis[2] = new Celular(1, 88, 12345678);

        // Itera e imprime a posição de cada um
        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }

        
    }
}

