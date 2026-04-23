package br.com.fiap.main;
import br.com.fiap.model.Basculante;
import br.com.fiap.model.Pivotante;
import br.com.fiap.model.Portao;

import java.util.ArrayList;

public class TestePortao {
    public static void main(String[] args) {

        Portao p1 = new Basculante("Alumínio", "branco", false, false, false, "cima");
        Portao p2 = new Pivotante("Aço", "preto", true, false, false, "direita");

        p1.abrir();
        p2.abrir();

        p1.fechar();
        p2.fechar();

        ArrayList<Portao> listaPortao = new ArrayList<>();
        listaPortao.add(p1);
        listaPortao.add(p2);

        for(Portao portao : listaPortao){
            System.out.println("Aberto: " + portao.isAberto());
            System.out.println("Trancado: " + portao.isTrancado());
        }
    }
}