package br.com.fiapride.main;
import br.com.fiapride.model.Portao;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Portao portao1 = new Portao();
        Portao portao2 = new Portao();

        portao1.cor = "preto";
        portao1.materialEstrutura = "Alumínio";
        portao1.temVidro = false;

        portao2.cor = "cinza";
        portao2.materialEstrutura = "Aço";
        portao2.temVidro = true;
        System.out.println("Cor do Portão: " + portao1.cor + " | Tipo de material da estrutura " + portao1.materialEstrutura + "  | Possui Vidro: " + portao1.temVidro);
        System.out.println("Cor do Portão: " + portao2.cor + " | Tipo de material da estrutura " + portao2.materialEstrutura + "  | Possui Vidro: " + portao2.temVidro);
    }
}