package br.com.fiap.model;

public class Basculante extends Portao {

    private String sentidoAbertura;

    public Basculante(String materialEstrutura, String cor, boolean temVidro,
                      boolean trancado, boolean aberto, String sentidoAbertura) {
        super(materialEstrutura, cor, temVidro, trancado, aberto);
        this.sentidoAbertura = sentidoAbertura;
    }

    @Override
    public void abrir() {
        if (isTrancado()) {
            System.out.println("Basculante trancado, não abre");
        } else if (isAberto()) {
            System.out.println("Basculante já está aberto");
        } else {
            System.out.println("Abrindo portão basculante para " + sentidoAbertura);
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (!isAberto()) {
            System.out.println("Basculante já está fechado");
        } else {
            System.out.println("Fechando portão basculante");
            setAberto(false);
        }
    }
}