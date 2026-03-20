package br.com.fiapride.model;

public class Portao {
    public String materialEstrutura;
    public String cor;
    public boolean temVidro;
    public boolean trancado;
    public boolean aberto;

    public Portao(String materialEstrutura, String cor, boolean temVidro, boolean trancado, boolean aberto) {
        this.materialEstrutura = materialEstrutura;
        this.cor = cor;
        this.temVidro = temVidro;
        this.trancado = trancado;
        this.aberto = aberto;
    }

    public void abrir() {
        if(trancado) {
            System.out.println("Não foi possivel abrir o portão, destranque ele");
            return;
        }
        if(trancado == false) {
            System.out.println("Portão aberto com sucesso");
            this.aberto = true;
        }
    }

    public void fechar() {
        if(aberto == true) {
            System.out.println("Fechando portão");
            this.aberto = false;
            return;
        }
    }

    public void trancar() {
        if(this.aberto == false && this.trancado == false) {
            System.out.println("Trancando o Portão");
        }
    }
    public void destrancar() {
        if(this.trancado == true) {
            System.out.println("Destrancando o portão");
            this.trancado = false;
            return;
        }
    }

    public void exibir() {
        System.out.print("Aberto: " + this.aberto );
        System.out.print("Trancado: " + this.trancado);
        System.out.print("Tem vidro: " + this.temVidro);
        System.out.print("Material do Portão: " + this.materialEstrutura);
        System.out.print("Cor: " + this.cor);
    }
}