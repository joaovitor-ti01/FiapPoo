package br.com.fiap.main;
import br.com.fiap.model.Portao;

public class TestePortao {
    public static void main(String[] args) {

        Portao portao1 = new Portao("Alumínio", "preto", false, false, false);
        Portao portao2 = new Portao("Aço", "cinza", true, true, false );

        portao1.exibir();
        portao2.exibir();

        portao1.abrir();

        portao1.trancar();

        portao2.destrancar();
        portao2.abrir();

        portao2.trancar();
        portao2.abrir();

        portao1.exibir();
        portao2.exibir();


    }

}