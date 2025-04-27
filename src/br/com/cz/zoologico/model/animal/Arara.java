package br.com.cz.zoologico.model.animal;

public class Arara extends Animal {
    private String corDasPenas;
    private String comidaPreferida;

    public Arara(int id,int quantidadeDePatas,String somEmitido,String corDasPenas, String comidaPreferida){
        super( id, quantidadeDePatas,somEmitido);
        this.corDasPenas=corDasPenas;
        this.comidaPreferida=comidaPreferida;
    }

    public String getComidaPreferida() {
        return this.comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }

    public String getCorDasPenas() {
        return this.corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

    @Override
    public String toString() {
        return "Arara{" +
                "corDasPenas='" + corDasPenas + '\'' +
                ", comidaPreferida='" + comidaPreferida + '\'' +
                '}';
    }
}
