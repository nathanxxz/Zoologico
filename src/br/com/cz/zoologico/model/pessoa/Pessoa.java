package br.com.cz.zoologico.model.pessoa;

public abstract class Pessoa {
    private int id;
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(int id,String cpf,String nome,int idade){
        this.id=id;
        this.setCpf(cpf);
        this.nome=nome;
        this.idade=idade;
    }

    public int getId() {
        return this.id;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    private void setCpf(String cpf){
        String pt1Cpf = cpf.substring(0,3);
        String pt2Cpf = cpf.substring(8, 11);
        this.cpf = String.format("%s*****%s", pt1Cpf, pt2Cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
