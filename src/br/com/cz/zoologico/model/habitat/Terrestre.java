package br.com.cz.zoologico.model.habitat;

public class Terrestre extends Habitat {
    private boolean possuiBrinquedos;

    public Terrestre(boolean posssuiLago,boolean possuiArvores,boolean possuiVegetacao,boolean possuiBrinquedos){
        super( posssuiLago, possuiArvores, possuiVegetacao);
        this.possuiBrinquedos=possuiBrinquedos;
    }

    public boolean isPossuiBrinquedos() {
        return this.possuiBrinquedos;
    }

    public void setPossuiBrinquedos(boolean novoPossuiBrinquedos) {
        this.possuiBrinquedos = novoPossuiBrinquedos;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "possuiBrinquedos=" + possuiBrinquedos +
                '}';
    }
}
