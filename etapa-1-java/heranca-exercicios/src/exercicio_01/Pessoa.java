package exercicio_01;

public class Pessoa {
    // variáveis
    private String nome;
    private String endereco;
    private String telefone;

    // construtores
    public Pessoa(String nome, String endereco, String telefone) { // os tres atributos
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String telefone) { // apenas nome e telefone
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = "";
    }

    public Pessoa(String nome) { // apenas nome
        this.nome = nome;
        this.endereco = "";
        this.telefone = "";
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // metodos
    public String toString() {
        String sPessoa = "\n\tNome: " + this.nome + "\n";
        if (!this.endereco.isEmpty()) {
            sPessoa += "\tEndereco: " + this.endereco + "\n";
        }
        if (!this.telefone.isEmpty()) {
            sPessoa += "\tTelefone: " + this.telefone + "\n";
        }
        return sPessoa;
    }
}
