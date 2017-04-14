package Interfaces;

public class Teste {    
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
        AreaCalculavel o = new Circulo(15);
        System.out.println(o.calculaArea());
        AreaCalculavel q = new Quadrado(5);
        System.out.println(q.calculaArea());
    }
}