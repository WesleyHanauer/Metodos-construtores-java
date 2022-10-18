package Exercicio1_2_3;

public class Operacoes {
    float a;
    float b;
    public Operacoes(float a, float b){
        this.a=a;
        this.b=b;
    }
    public Operacoes(float a){
        this.a=a;
    }
    public float soma(){
        return a+b;
    }
    public float subtracao(){
        return a-b;
    }
    public float divisao(){
        return a/b;
    }
    public float multiplicacao(){
        return a*b;
    }
    public float exponenciacao(){
        return a*a;
    }
    public float areaQ(){
        return a*a;
    }
    public float areaC(){
        double resultado=Math.PI*a*a;
        return (float) resultado;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}