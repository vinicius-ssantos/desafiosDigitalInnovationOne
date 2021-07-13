package digital.innovation.one.desafios.java.Exercicios.IniciandoAProgramaçãoemJava.Desafio01;

import java.io.IOException;
import java.util.Scanner;
public class Desafio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2 ; i <= n; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}