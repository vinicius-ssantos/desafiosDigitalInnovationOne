package digital.innovation.one.desafios.java.IntroduçãoABuscaESubstituiçãoEmJava._5AtalhosParaOWebloggerBrasil;

import java.util.Scanner;

public class MaincERTA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String entrada = scan.nextLine();
            while (entrada.contains("_") || entrada.contains("*")) {
                entrada = entrada.replaceFirst("\\*", "<b>").replaceFirst("\\*", "</b>").replaceFirst("_", "<i>").replaceFirst("_", "</i>");
            }
            System.out.println(entrada);
        }
    }
}
