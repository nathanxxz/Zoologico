package br.com.cz.zoologico.model.habitat;

public class Aquatico extends Habitat {
    private boolean aguaEstaLimpa;

    public Aquatico(boolean possuiLago,boolean possuiArvores,boolean possuiVegetacao,boolean aguaEstaLimpa){
        super (possuiLago, possuiArvores, possuiVegetacao);
        this.aguaEstaLimpa=aguaEstaLimpa;
    }

    public boolean isAguaEstaLimpa() {
        return this.aguaEstaLimpa;
    }

    public void setAguaEstaLimpa(boolean aguaEstaLimpa) {
        this.aguaEstaLimpa = aguaEstaLimpa;
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "aguaEstaLimpa='" + aguaEstaLimpa + '\'' +
                '}';
    }
}
