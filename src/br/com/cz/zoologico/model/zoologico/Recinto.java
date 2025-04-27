package br.com.cz.zoologico.model.zoologico;

import br.com.cz.zoologico.model.animal.Animal;
import br.com.cz.zoologico.model.habitat.Habitat;

import java.util.Arrays;

public class Recinto {
     private int id;
    private String nomeRecinto;
    private Habitat habitatAssociado;
    private int quantidadeDeAnimaisInseridos;
    Animal[]animals;

    public Recinto(int id,String nomeRecinto,Habitat habitatAssociado, int quantidadeDeAnimaisInseridos){
        this.id=id;
        this.nomeRecinto=nomeRecinto;
        this.habitatAssociado=habitatAssociado;
        this.animals=new Animal[this.quantidadeDeAnimaisInseridos];
    }
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nomeRecinto;
    }

    public Habitat getHabitat() {
        return this.habitatAssociado;
    }
    public boolean inserirAnimal(Animal animal){
        if (this.quantidadeDeAnimaisInseridos==this.animals.length){
            System.out.println("Nao ha como inserir mais animais");
            return false;
        }
        for(int i=0;i<this.animals.length;i++){
            if(this.animals[i]==null){
            this.animals[i]=animal;
            this.quantidadeDeAnimaisInseridos++;
            System.out.println("Animal inserido");
            return true;
        }}
        return false;
    }
    public boolean removerAnimal(int id){
        for(int i=0;i<this.animals.length;i++){
            if (this.animals[i]!=null && this.animals[i].getId()==id);
            this.animals[i]=null;
            this.quantidadeDeAnimaisInseridos--;
            System.out.println("Animal removido");
            return true;
        }
        return false;
    }
    public boolean atualizarAnimal(int id, Animal novoAnimal){
        for(int i=0;i<this.animals.length;i++){
            if (this.animals[i]!= null && this.animals[i].getId()==id){
                this.animals[i]=novoAnimal;
                System.out.println("Animal atualizado");
                return true;
            }
        }
        return false;

    }

    public void exibirAnimais(){
        for(int i=0;i<this.animals.length;i++){
            System.out.println(this.animals[i]);
        }
    }

    @Override
    public String toString() {
        return "Recinto{" +
                "id=" + id +
                ", nomeRecinto='" + nomeRecinto + '\'' +
                ", habitatAssociado=" + habitatAssociado +
                ", quantidadeDeAnimaisInseridos=" + quantidadeDeAnimaisInseridos +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
