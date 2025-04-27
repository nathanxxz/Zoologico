package br.com.cz.zoologico.model.animal;

public class Jacare extends Animal {
    private double tamanho;

    public Jacare(int id,int quantidadeDePatas,String somEmitido,double tamanho){
        super( id, quantidadeDePatas,somEmitido);
        this.tamanho=tamanho;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double novoTamanho) {
        this.tamanho = novoTamanho;
    }

    @Override
    public String toString() {
        return "Jacare{" +
                "tamanho=" + tamanho +
                '}';
    }
}
