package br.com.cz.zoologico.model.animal;

public abstract class Animal {
    private int id;
    protected int quantidadeDePatas;
    protected String somEmitido;

    protected Animal(int id,int quantidadeDePatas,String somEmitido){
        this.id=id;
        this.quantidadeDePatas=quantidadeDePatas;
        this.somEmitido=somEmitido;

    }

    public int getId() {
        return this.id;
    }

    public String getSomEmitido() {
        return this.somEmitido;
    }

    public void setSomEmitido(String somEmitido) {
        this.somEmitido = somEmitido;
    }

    public int getQuantidadeDePatas() {
        return this.quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", quantidadeDePatas=" + quantidadeDePatas +
                ", somEmitido='" + somEmitido + '\'' +
                '}';
    }
}
