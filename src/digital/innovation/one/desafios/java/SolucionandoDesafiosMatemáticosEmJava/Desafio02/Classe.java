package digital.innovation.one.desafios.java.SolucionandoDesafiosMatemáticosEmJava.Desafio02;

import java.util.Scanner;

class Classe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double area = 3.14159 * (Math.pow(raio, 2));
        System.out.printf("A=%.4f\n", area);
    }
}