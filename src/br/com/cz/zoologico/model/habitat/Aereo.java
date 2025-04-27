package br.com.cz.zoologico.model.habitat;

public class Aereo extends Habitat {
    private int quantidadeArvores;

    public Aereo(boolean possuiLago,boolean possuiArvores,boolean possuiVegetacao,int quantidadeArvores){
        super(possuiLago, possuiArvores, possuiVegetacao);
        this.quantidadeArvores=quantidadeArvores;
    }

    public int getQuantidadeArvores() {
        return this.quantidadeArvores;
    }

    public void setQuantidadeArvores(int quantidadeArvores) {
        this.quantidadeArvores = quantidadeArvores;
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "quantidadeArvores=" + quantidadeArvores +
                '}';
    }
}
