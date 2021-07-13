package digital.innovation.one.desafios.java.Exercicios.ResolvendoAlgoritmosComJava._4HashMágico;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> linhas = new ArrayList<>();
//        List<String> linhas = Arrays.asList("OSADOISAJDSAOIDJA", "ASOIJDOSAJDASOIDJA");
        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);
        map.put("D", 3);
        map.put("E", 4);
        map.put("F", 5);
        map.put("G", 6);
        map.put("H", 7);
        map.put("I", 8);
        map.put("J", 9);
        map.put("K", 10);
        map.put("L", 11);
        map.put("M", 12);
        map.put("N", 13);
        map.put("O", 14);
        map.put("P", 15);
        map.put("Q", 16);
        map.put("R", 17);
        map.put("S", 18);
        map.put("T", 19);
        map.put("U", 20);
        map.put("V", 21);
        map.put("W", 22);
        map.put("X", 23);
        map.put("Y", 24);
        map.put("Z", 25);
        Scanner scan = new Scanner(System.in);
        int countCasos = 0;
        int countLinhas = 0;
        int qtdCasosTeste;
        try {
            qtdCasosTeste = Integer.parseInt(scan.nextLine().split(" ")[0]);
        } catch (Exception e) {
            return;
        }
        while (countCasos++ < qtdCasosTeste) {
            int qtdLinhas;
            try {
                qtdLinhas = Integer.parseInt(scan.nextLine().split(" ")[0]);
            } catch (Exception e) {
                return;
            }
            while (countLinhas++ < qtdLinhas) {
                String novaLinha = scan.nextLine();
                linhas.add(novaLinha);
            }
        }
        int valorTotal = 0;
        for (int i = 0; i < linhas.size(); i++) {
            String elementoEntrada = linhas.get(i);
            for (int j = 0; j < elementoEntrada.length(); j++) {
                char posElemento = elementoEntrada.charAt(j);
                String stringPosElemento = Character.toString(posElemento);
//                System.out.println(posElemento);
                if (map.containsKey(stringPosElemento)) {
                    int valorChave = map.get(stringPosElemento);
                    valorTotal += valorChave + i + j;
                }
            }
        }
        System.out.println(valorTotal);
    }
}
/*

O conceito de hash é transformar uma grande quantidade de dados em uma pequena quantidade de informações. Nesse algoritmo você terá uma
entrada com várias linhas, cada uma com uma string.

O valor de cada caracter é computado como segue:

Valor = (Posição no alfabeto) + (Elemento de entrada) + (Posição do elemento)

As posições iniciam em zero. "A" tem posição 0 no alfabeto, ‘C" tem posição 2 no alfabeto, ... O cálculo de hash retornado é a soma de todos os
caracteres da entrada. Por exemplo, se a entrada for:

CBA

DDD

então cada caractere deverá ser computado como segue:

2 = 2 + 0 + 0 : "C" no elemento 0 posição 0

2 = 1 + 0 + 1 : "B" no elemento 0 posição 1

2 = 0 + 0 + 2 : "A" no elemento 0 posição 2

4 = 3 + 1 + 0 : "D" no elemento 1 posição 0

5 = 3 + 1 + 1 : "D" no elemento 1 posição 1

6 = 3 + 1 + 2 : "D" no elemento 1 posição 2

O cálculo final de hash será 2+2+2+4+5+6 = 21.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de
teste inicia com um inteiro L (1 ≤ L ≤ 100) que indica a quantidade de linhas que vem a seguir. Cada uma destas L linhas contém uma string com
até 50 letras maiúsculas ("A" - "Z").

Saída
Para cada caso de teste imprima o valor de hash que é calculado conforme o exemplo apresentado acima.


Dado de entrada:
1
2
OSADOISAJDSAOIDJA
ASOIJDOSAJDASOIDJA
Saída esperada:
594
 */