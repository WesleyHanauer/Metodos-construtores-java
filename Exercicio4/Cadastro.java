package Exercicio4;
import java.util.Scanner;

public class Cadastro {
public static Scanner ler=new Scanner(System.in);
public static boolean continuaCad(String c){
    if(c.equals("sim")){
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        Pessoa[] lista = new Pessoa[10];

        int cont=0;
        for (int i=0;i<10;i++){
                String continuar=null;
                lista[i] = new Pessoa();
                System.out.println("Informe um nome para a pessoa "+(cont+1));
                String nome=ler.next();
                lista[i].setNome(nome);
                System.out.println("Continuar cadastrando?");
                continuar = ler.next();
                if (continuaCad(continuar)){

                    System.out.println("Informe um Email para a pessoa " + (cont+1));
                    String email = ler.next();
                    lista[i].setEmail(email);

                    System.out.println("Continuar cadastrando?");
                    continuar = ler.next();

                    if (continuaCad(continuar)){

                        System.out.println("Informe um enredeco para a pessoa " + (cont+1));
                        String endereco = ler.next();
                        lista[i].setEndereco(endereco);

                        System.out.println("Continuar cadastrando?");
                        continuar = ler.next();

                        if (continuaCad(continuar)){

                            System.out.println("Informe um telefone para a pessoa " + (cont+1));
                            String telefone = ler.next();
                            lista[i].setTelefone(telefone);
                        }
                    }
                }

            cont++;
        }
        for(int i=0;i<10;i++){
            System.out.println("Nome: "+lista[i].getNome()+" Email: "+lista[i].getEmail()+" Endereco: "+lista[i].getEndereco()+" Telefone: "+lista[i].getTelefone());
        }
    }
}
