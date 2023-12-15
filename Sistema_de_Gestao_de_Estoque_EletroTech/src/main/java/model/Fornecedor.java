package model;

public class Fornecedor {
    private int id;
    private String cnpj_cpf;
    private String nome;
    private String razao_social;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", cnpj_cpf='" + cnpj_cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", razao_social='" + razao_social + '\'' +
                '}';
    }
}
