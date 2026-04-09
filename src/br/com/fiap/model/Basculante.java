package br.com.fiap.model;
import br.com.fiap.model.Portao;

public class Basculante extends Portao{
   private String sentidoAbertura; //cima baixo

    public String getSentidoAbertura() {
        return sentidoAbertura;
    }

    public void setSentidoAbertura(String sentidoAbertura) {
        this.sentidoAbertura = sentidoAbertura;
    }

    public Basculante(String materialEstrutura, String cor, boolean temVidro, boolean trancado, boolean aberto, String sentidoAbertura){
        super(materialEstrutura, cor, temVidro, trancado, aberto);
        this.sentidoAbertura = sentidoAbertura;
    }

    public String sentidoAbertura(){
        return sentidoAbertura;
    }
}
