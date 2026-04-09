package br.com.fiap.model;

public class Portao {
    private String materialEstrutura;
    private String cor;
    private boolean temVidro;
    private boolean trancado;
    private boolean aberto;

    public Portao(String materialEstrutura, String cor, boolean temVidro, boolean trancado, boolean aberto) {
        this.setMaterialEstrutura(materialEstrutura);
        this.setCor(cor);
        this.setTemVidro(temVidro);
        this.setTrancado(trancado);
        this.setAberto(aberto);
    }

    public void trancar() {
        if (this.aberto == false && this.trancado == false) {
            System.out.println("Trancando o Portão");
        }
    }

    public void destrancar() {
        if (!this.aberto && !this.trancado) {
            System.out.println("Trancando o portão");
            this.trancado = true;
        }
    }

    public void exibir() {
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Trancado: " + this.trancado);
        System.out.println("Tem vidro: " + this.temVidro);
        System.out.println("Material do Portão: " + this.materialEstrutura);
        System.out.println("Cor: " + this.cor);
        System.out.println("----------------------");
    }

    public void abrir(){
        System.out.println("Abrindo");
    }
    public void fechar(){
        System.out.println("Fechando");
    }

    public String getMaterialEstrutura() {
        return materialEstrutura;
    }

    public void setMaterialEstrutura(String materialEstrutura) {
        this.materialEstrutura = materialEstrutura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemVidro() {
        return temVidro;
    }

    public void setTemVidro(boolean temVidro) {
        this.temVidro = temVidro;
    }

    public boolean isTrancado() {
        return trancado;
    }

    public void setTrancado(boolean trancado) {
        this.trancado = trancado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
