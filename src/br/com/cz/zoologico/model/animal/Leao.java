package br.com.cz.zoologico.model.animal;

public class Leao extends  Animal {
    private String corDoPelo;
    private boolean possuiJuba;

    public Leao(int id,int quantidadeDePatas,String somEmitido,String corDoPelo,boolean possuiJuba){
        super(id, quantidadeDePatas,somEmitido);
        this.corDoPelo=corDoPelo;
        this.possuiJuba=possuiJuba;
    }

    public boolean isPossuiJuba() {
        return this.possuiJuba;
    }

    public void setPossuiJuba(boolean possuiJuba) {
        this.possuiJuba = possuiJuba;
    }

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String novoCorDoPelo) {
        this.corDoPelo = novoCorDoPelo;
    }

    @Override
    public String toString() {
        return "Leao{" +
                "corDoPelo='" + corDoPelo + '\'' +
                ", possuiJuba=" + possuiJuba +
                '}';
    }
}
