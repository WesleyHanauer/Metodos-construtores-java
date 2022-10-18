package Pessoa;

public class Pessoa {
    String nome;
    String sobrenome;
    String mail;

    public Pessoa(String nome, String sobrenome){
        this.nome=nome;
        this.sobrenome=sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String mail){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.mail=mail;
    }

    public Pessoa(){
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
