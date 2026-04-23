package br.com.fiap.model;
import br.com.fiap.model.Portao;

public class Pivotante extends Portao {

    private String ladoAbertura;

    public Pivotante(String materialEstrutura, String cor, boolean temVidro,
                     boolean trancado, boolean aberto, String ladoAbertura) {
        super(materialEstrutura, cor, temVidro, trancado, aberto);
        this.ladoAbertura = ladoAbertura;
    }

    @Override
    public void abrir() {
        if (isTrancado()) {
            System.out.println("Pivotante trancado, não abre");
        } else if (isAberto()) {
            System.out.println("Pivotante já está aberto");
        } else {
            System.out.println("Abrindo portão pivotante para o lado " + ladoAbertura);
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (!isAberto()) {
            System.out.println("Pivotante já está fechado");
        } else {
            System.out.println("Fechando portão pivotante");
            setAberto(false);
        }
    }
}