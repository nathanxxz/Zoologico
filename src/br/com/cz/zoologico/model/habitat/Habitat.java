package br.com.cz.zoologico.model.habitat;

public abstract class Habitat {
    protected boolean possuiLago;
    protected boolean possuiArvores;
    protected boolean possuiVegetacao;

    public Habitat(boolean possuiLago,boolean possuiArvores,boolean possuiVegetacao){
        this.possuiLago=possuiLago;
        this.possuiArvores=possuiArvores;
        this.possuiVegetacao=possuiVegetacao;

    }

    public boolean getPossuiVegetacao() {
        return this.possuiVegetacao;
    }

    public void setPossuiVegetacao(boolean NovapossuiVegetacao) {
        this.possuiVegetacao = NovapossuiVegetacao;
    }

    public boolean isPossuiArvores() {
        return this.possuiArvores;
    }

    public void setPossuiArvores(boolean NovapossuiArvores) {
        this.possuiArvores = NovapossuiArvores;
    }

    public boolean isPosssuiLago() {
        return this.possuiLago;
    }

    public void setPosssuiLago(boolean NovoposssuiLago) {
        this.possuiLago = NovoposssuiLago;
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "posssuiLago=" + possuiLago +
                ", possuiArvores=" + possuiArvores +
                ", possuiVegetacao=" + possuiVegetacao +
                '}';
    }
}
