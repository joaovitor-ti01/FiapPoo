package br.com.fiapride.model;

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
    public String getMaterialEstrutura() {
        return materialEstrutura;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTemVidro() {
        return temVidro;
    }

    public boolean isTrancado() {
        return trancado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void abrir() {
        if(trancado) {
            System.out.println("Não foi possível abrir o portão, destranque ele");
            return;
        if(trancado == false) {
            System.out.println("Portão aberto com sucesso");
            this.aberto = true;
        }
    }


        if(aberto) {
            System.out.println("O portão já está aberto");
            return;
        }
        System.out.println("Portão aberto com sucesso");
        this.aberto = true;
    }

    public void fechar() {
        if(!aberto) {
            System.out.println("O portão já está fechado");
            return;
        }

        System.out.println("Fechando portão");
        aberto = false;
    }
    }

    public void trancar() {
        if(this.aberto == false && this.trancado == false) {
            System.out.println("Trancando o Portão");
        }
    }
    public void destrancar() {
        if(!this.aberto && !this.trancado) {
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

private void setMaterialEstrutura(String materialEstrutura) {
    this.materialEstrutura = materialEstrutura;
}

private void setCor(String cor) {
    this.cor = cor;
}

private void setTemVidro(boolean temVidro) {
    this.temVidro = temVidro;
}

private void setTrancado(boolean trancado) {
    this.trancado = trancado;
}

private void setAberto(boolean aberto) {
    this.aberto = aberto;
}
}