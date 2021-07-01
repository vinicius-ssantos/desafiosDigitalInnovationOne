package digital.innovation.one.desafios.java.FundamentosAritmeticosEmJava._4ContagemDeCédulas;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        int nota = valor;
        int nota100 = nota / 100;
        nota -= nota100 * 100;
        int nota50 = nota / 50;
        nota -= nota50 * 50;
        int nota20 = nota / 20;
        nota -= nota20 * 20;
        int nota10 = nota / 10;
        nota -= nota10 * 10;
        int nota5 = nota / 5;
        nota -= nota5 * 5;
        int nota2 = nota / 2;
        nota -= nota2 * 2;
        int nota1 = nota / 1;
        nota -= nota1 * 1;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);

    }

}