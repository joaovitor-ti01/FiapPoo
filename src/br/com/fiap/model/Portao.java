package br.com.fiap.model;

public class Portao {
    private String materialEstrutura;
    private String cor;
    private boolean temVidro;
    private boolean trancado;
    private boolean aberto;

    public Portao(String materialEstrutura, String cor, boolean temVidro, boolean trancado, boolean aberto) {
        this.materialEstrutura = materialEstrutura;
        this.cor = cor;
        this.temVidro = temVidro;
        this.trancado = trancado;
        this.aberto = aberto;
    }

    public void abrir() {
        if (trancado) {
            System.out.println("Não é possível abrir: portão trancado");
        } else if (aberto) {
            System.out.println("O portão já está aberto");
        } else {
            System.out.println("Abrindo portão...");
            aberto = true;
        }
    }

    public void fechar() {
        if (!aberto) {
            System.out.println("O portão já está fechado");
        } else {
            System.out.println("Fechando portão...");
            aberto = false;
        }
    }

    public void trancar() {
        if (aberto) {
            System.out.println("Não pode trancar com o portão aberto");
        } else if (trancado) {
            System.out.println("Já está trancado");
        } else {
            System.out.println("Trancando portão");
            trancado = true;
        }
    }

    public void destrancar() {
        if (!trancado) {
            System.out.println("Já está destrancado");
        } else {
            System.out.println("Destrancando portão");
            trancado = false;
        }
    }

    // getters e setters
    public boolean isTrancado() { return trancado; }
    public boolean isAberto() { return aberto; }
    public void setAberto(boolean aberto) { this.aberto = aberto; }
}
