package digital.innovation.one.desafios.java.Exercicios.IniciandoAProgramaçãoemJava.Desafio02;

import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cpf = scan.nextLine();
        String[] cpfArr = cpf.split("[.-]");
        for (String s : cpfArr) {
            System.out.println(s);

        }


    }
}