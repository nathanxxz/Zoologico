package br.com.cz.zoologico.model.zoologico;

import br.com.cz.zoologico.model.pessoa.Funcionario;
import br.com.cz.zoologico.model.pessoa.Visitante;

import java.util.Arrays;

public class Zoologico {
    public String nome;
    Recinto[]recintos;
    public int quantidadeRecintosInseridos;
    Funcionario[]funcionarios;
    public int quantidadeFuncionarioInseridos;
    Visitante[]visitantes;
    public int quantidadeVisitantesInseridos;

    public Zoologico(String nome, int quantidadeRecintosInseridos,int quantidadeFuncionarioInseridos,int quantidadeVisitantesInseridos){
        this.quantidadeFuncionarioInseridos=quantidadeFuncionarioInseridos;
        this.quantidadeRecintosInseridos=quantidadeRecintosInseridos;
        this.quantidadeVisitantesInseridos=quantidadeVisitantesInseridos;
        this.funcionarios=new Funcionario[this.quantidadeFuncionarioInseridos];
        this.recintos=new Recinto[this.quantidadeRecintosInseridos];
        this.visitantes=new Visitante[this.quantidadeVisitantesInseridos];

    }
    public boolean inserirRecinto(Recinto recinto){
        if (this.quantidadeRecintosInseridos==this.recintos.length){
            System.out.println("Esta lotado");
            return false;
        }
        for(int i=0;i<this.recintos.length;i++){
            this.recintos[i]=null;
            this.recintos[i]=recinto;
            this.quantidadeRecintosInseridos++;
            System.out.println("Recinto inserido");
            return true;
        }
        return false;
    }
    public boolean removerRecinto(int id){
        for(int i=0;i<this.recintos.length;i++){
            if (this.recintos[i]!= null && this.recintos[i].getId()==id){
                this.recintos[i]=null;
                this.quantidadeRecintosInseridos--;
                System.out.println("Recinto removido");
                return true;
            }
        }
        return false;
    }
    public  boolean atualizarRecinto(Recinto novoRecinto, int id){
        for(int i=0;i<this.recintos.length;i++){
            if (this.recintos[i]!= null && this.recintos[i].getId()==id){
                this.recintos[i]=novoRecinto;
                System.out.println("Recinto atualizado");
                return true;
            }
        }
        return false;
    }
    public void listarRecintos(){
        for(int i=0;i<this.recintos.length;i++){
            System.out.println(this.recintos[i]);
        }
    }
    public boolean inserirFuncionario(Funcionario funcionario){
        if (this.quantidadeFuncionarioInseridos==this.funcionarios.length){
            System.out.println("Nao tem como add");
            return false;
        }
        for(int i=0;i<this.funcionarios.length;i++){
            this.funcionarios[i]=null;
            this.funcionarios[i]=funcionario;
            this.quantidadeFuncionarioInseridos++;
            System.out.println("Funcionario inserido");
            return true;
        }
        return false;
    }
    public boolean removerFuncionario(int id){
        for(int i=0;i<this.funcionarios.length;i++){
            if (this.funcionarios[i]!= null && this.funcionarios[i].getId()==id){
                this.funcionarios[i]=null;
                this.quantidadeFuncionarioInseridos--;
                System.out.println("Funcionario removido");
                return true;
            }
        }
        return false;
    }
    public boolean atualizarFuncionario(Funcionario novoFuncionario, int id){
        for(int i=0;i<this.funcionarios.length;i++){
            if (this.funcionarios[i]!=null && this.funcionarios[i].getId()==id){
                this.funcionarios[i]=novoFuncionario;
                System.out.println("Funcionario atualizado");
                return true;
            }
        }
        return false;
    }
    public void listarFuncionarios(){
        for(int i=0;i<this.funcionarios.length;i++){
            System.out.println(this.funcionarios[i]);
        }
    }
    public boolean inserirVisitante(Visitante visitante){
        if (this.quantidadeVisitantesInseridos==this.visitantes.length){
            System.out.println("Nao ha como inserir visitante");
            return false;
        }
        for (int i=0;i<this.visitantes.length;i++){
            this.visitantes[i]=null;
            this.visitantes[i]=visitante;
            this.quantidadeVisitantesInseridos++;
            System.out.println("Visitante inserido");
            return true;
        }
        return false;
    }
    public boolean removerVisitante(int id){
        for(int i=0;i<this.visitantes.length;i++){
            if (this.visitantes[i]!=null && this.visitantes[i].getId()==id){
                this.visitantes[i]=null;
                this.quantidadeVisitantesInseridos--;
                System.out.println("Visitante removido");
                return true;
            }
        }
        return false;
    }
    public boolean atualizarVisitante(Visitante novoVisitante, int id){
        for(int i=0;i<this.visitantes.length;i++){
            if (this.visitantes[i]!=null && this.visitantes[i].getId()==id){
                this.visitantes[i]=novoVisitante;
                System.out.println("Visitante atualizado");
                return true;
            }
        }
        return false;
    }
    public void listarVisitantes(){
        for(int i=0;i<this.visitantes.length;i++){
            System.out.println(this.visitantes[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", recintos=" + Arrays.toString(recintos) +
                ", quantidadeRecintosInseridos=" + quantidadeRecintosInseridos +
                ", funcionarios=" + Arrays.toString(funcionarios) +
                ", quantidadeFuncionarioInseridos=" + quantidadeFuncionarioInseridos +
                ", visitantes=" + Arrays.toString(visitantes) +
                ", quantidadeVisitantesInseridos=" + quantidadeVisitantesInseridos +
                '}';
    }
}
