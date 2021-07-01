package digital.innovation.one.desafios.java.SolucionandoDesafiosMatemáticosEmJava.Desafio04;

import java.io.IOException;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }


}