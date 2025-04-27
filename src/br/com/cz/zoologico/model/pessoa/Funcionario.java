package br.com.cz.zoologico.model.pessoa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(double salario,int id,String cpf,String nome,int idade){
        super(id,cpf,nome,idade);
        this.salario=salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
