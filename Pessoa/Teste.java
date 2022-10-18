package Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana","Silva");
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa("Luis","Felipe","luisfelipe@gmail");
        System.out.println(p1.getNome());
    }
}