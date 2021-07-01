package digital.innovation.one.desafios.java.SolucionandoDesafiosMatemáticosEmJava.Desafio05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista.add(leitor.nextInt());
        }
        long paresCount = lista.stream().filter(valor -> valor % 2 == 0).count();
        long imparCount = lista.stream().filter(valor -> !(valor % 2 == 0)).count();
        long posCount = lista.stream().filter(valor -> valor > 0).count();
        long negCount = lista.stream().filter(valor -> valor < 0).count();
        String result = String.format("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)", paresCount, imparCount, posCount, negCount);
        System.out.println(result);
    }
}