package digital.innovation.one.desafios.java.Exercicios.SolucionandoDesafiosMatemáticosEmJava.Desafio05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asd {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        lista.add(-5);
        lista.add(0);
        lista.add(-3);
        lista.add(-4);
        lista.add(12);
        long paresCount = lista.stream().filter(valor -> valor % 2 == 0).count();
        long imparCount = lista.stream().filter(valor -> !(valor % 2 == 0)).count();
        long posCount = lista.stream().filter(valor -> valor > 0).count();
        long negCount = lista.stream().filter(valor -> valor < 0 ).count();
        System.out.println(paresCount);
        System.out.println(imparCount);
        System.out.println(posCount);
        System.out.println(negCount);
        String result = String.format("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s) ",paresCount,imparCount,posCount,negCount);
        System.out.println(result);

    }
}