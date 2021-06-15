package digital.innovation.one.desafios.java.SolucionandoDesafiosMatemáticosEmJava.Desafio03;

import java.io.IOException;
import java.util.Scanner;
public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numHora = scan.nextInt();
        int salarioPorHora = scan.nextInt();
        double horasTrabalhadas = scan.nextDouble();
        double SALARY = salarioPorHora * horasTrabalhadas;
        System.out.printf("NUMBER = %d\n", numHora);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}