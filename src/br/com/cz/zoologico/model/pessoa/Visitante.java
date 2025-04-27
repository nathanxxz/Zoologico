package br.com.cz.zoologico.model.pessoa;

public class Visitante extends Pessoa {
    private boolean vip;

    public Visitante(int id,String cpf,String nome,int idade,boolean vip){
        super(id,cpf,nome,idade);
        this.vip=vip;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean novoVip) {
        this.vip = novoVip;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "vip=" + vip +
                '}';
    }
}
