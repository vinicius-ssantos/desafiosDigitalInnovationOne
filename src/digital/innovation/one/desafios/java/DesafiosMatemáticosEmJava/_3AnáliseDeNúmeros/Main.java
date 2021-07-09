package digital.innovation.one.desafios.java.DesafiosMatemáticosEmJava._3AnáliseDeNúmeros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista.add(leitor.nextInt());
        }
        long paresCount = lista.stream().filter(valor -> valor % 2 == 0).count();
        long imparCount = lista.stream().filter(valor -> !(valor % 2 == 0)).count();
        long posCount = lista.stream().filter(valor -> valor > 0).count();
        long negCount = lista.stream().filter(valor -> valor < 0 ).count();
        String result = String.format("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s) ",paresCount,imparCount,posCount,negCount);
        System.out.println(result);
    }
}
/*
Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados
são pares, quantos valores informados são ímpares, quantos valores informados são positivos e
quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não
esquecendo o final de linha após cada uma.


Dado de entrada:
-5
0
-3
-4
12
Saída esperada:
3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */
