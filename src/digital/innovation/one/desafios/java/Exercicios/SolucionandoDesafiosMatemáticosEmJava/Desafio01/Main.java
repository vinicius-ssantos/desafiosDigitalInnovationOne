package digital.innovation.one.desafios.java.Exercicios.SolucionandoDesafiosMatemáticosEmJava.Desafio01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        Scanner scan = new Scanner(System.in);

        int temp = scan.nextInt();
        int vel = scan.nextInt();
        double asd = (temp * vel) / 12.0;
        
        System.out.printf("%.3f\n", asd);
    }
}