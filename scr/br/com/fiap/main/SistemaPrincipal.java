package br.com.fiapride.main;
import br.com.fiapride.model.Portao;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Portao portao1 = new Portao("Alumínio", "preto", false, false, true);
        Portao portao2 = new Portao("Aço", "cinza", true, true, false );


        portao1.exibir();
        portao2.exibir();

        portao1.abrir();
        portao1.fechar();
        portao1.trancar();

        portao2.destrancar();
        portao2.abrir();
        portao2.fechar();
        portao2.trancar();
        portao2.abrir();

        portao1.exibir();
        portao2.exibir();
    }
}