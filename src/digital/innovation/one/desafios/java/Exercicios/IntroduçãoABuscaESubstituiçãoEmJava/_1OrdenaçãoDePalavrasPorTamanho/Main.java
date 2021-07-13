package digital.innovation.one.desafios.java.Exercicios.IntroduçãoABuscaESubstituiçãoEmJava._1OrdenaçãoDePalavrasPorTamanho;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int inputs = Integer.parseInt(scan.nextLine());
            List<String[]> list = new ArrayList<>();
            int count = 1;
            do {
                String valorEntrada = scan.nextLine();
                String[] valorString = valorEntrada.split(" ");
                list.add(valorString);
                count++;
            } while (count <= inputs);
            Comparator<String> comp = Comparator.comparing(String::length).reversed();
            for (String[] s : list) {
                Arrays.sort(s, comp);
                String stringformat = Arrays.stream(s)
                        .map(x -> x.concat(" "))
                        .collect(Collectors.joining());
                System.out.println(stringformat.substring(0, stringformat.length() - 1));
            }
        }
    }
}

/*
Desafio
Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve
receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das
palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem
alfabética.

Entrada
A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste.
Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá
conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

Saída
A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e
caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em
branco deve ser impresso entre duas palavras.

Dado de entrada:
2
One three four mond at midnight
one three five
Saída esperada:
midnight three four mond One at
three five one

Exemplo de Saída
*/