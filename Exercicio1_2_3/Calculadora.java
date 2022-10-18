package Exercicio1_2_3;
import java.util.Scanner;

public class Calculadora {
    public static Scanner ler = new Scanner(System.in);
    public static int operacao;
    public static void selecionaOp(){
        System.out.println("Selecione a operacao:");
        System.out.println("Para soma, digite 1.");
        System.out.println("Para subtracao, digite 2.");
        System.out.println("Para divisao, digite 3.");
        System.out.println("Para multiplicacao, digite 4.");
        System.out.println("Para exponenciacao, digite 5.");
        System.out.println("Para area do quadrado, digite 6.");
        System.out.println("Para area do circulo, digite 7.");
        operacao = ler.nextInt();
    }
    public static void main(String[] args) {
        while(true){
        Calculadora.selecionaOp();
        if(operacao==1){
            float a;
            float b;
            System.out.println("Informe dois valores para somar.");
            a=ler.nextFloat();
            b=ler.nextFloat();
            Operacoes soma = new Operacoes(a,b);
            System.out.println(soma.soma());
        }
        else if(operacao==2){
            float a;
            float b;
            System.out.println("Informe dois valores para subtrair.");
            a=ler.nextFloat();
            b=ler.nextFloat();
            Operacoes subtracao = new Operacoes(a,b);
            System.out.println(subtracao.subtracao());
        }
        else if(operacao==3){
            float a;
            float b;
            System.out.println("Informe dois valores para dividir.");
            a=ler.nextFloat();
            b=ler.nextFloat();
            Operacoes divisao = new Operacoes(a,b);
            System.out.println(divisao.divisao());
        }
        else if(operacao==4){
            float a;
            float b;
            System.out.println("Informe dois valores para multiplicar.");
            a=ler.nextFloat();
            b=ler.nextFloat();
            Operacoes multiplicacao = new Operacoes(a,b);
            System.out.println(multiplicacao.multiplicacao());
        }
        else if(operacao==5){
            float a;
            System.out.println("Informe um valor para exponenciar.");
            a=ler.nextFloat();
            Operacoes exponenciacao = new Operacoes(a);
            System.out.println(exponenciacao.exponenciacao());
        }
        else if (operacao == 6) {
            System.out.println("Informe a medida de um dos lados do quadrado.");
            float a = ler.nextFloat();
            Operacoes areaQ = new Operacoes(a);
            System.out.println("Area do quadrado: " + areaQ.areaQ());
        } else if (operacao == 7) {
            System.out.println("Informe a medida do raio do circulo.");
            float a = ler.nextFloat();
            Operacoes areaC = new Operacoes(a);
            System.out.println("Area do circulo: " + areaC.areaC());
        }
        }
    }
}
