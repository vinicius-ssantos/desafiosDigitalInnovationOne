package digital.innovation.one.desafios.java.SoluçãoDeProblemasComJava._1ContagemRepetidaDeNúmeros;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int count=0;
        Map<Integer,Integer> valores = new TreeMap<>();
        while(++count<=entrada){
            int val = scan.nextInt();
              if (valores.containsKey(val)){
                  valores.put(val,valores.get(val)+1);
              }else {
                  valores.put(val,1);
              }
        }
        for (Map.Entry<Integer,Integer> valor: valores.entrySet()){
            System.out.println(valor.getKey()+" aparece "+valor.getValue()+" vez(es)");
        }
    }
}
/*

Desafio
Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada
número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem
na entrada por ordem crescente de valor.

Entrada
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de
valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada
número não aparecerá mais do que 20 vezes na entrada de dados.

Saída
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes
cada um deles aparece na entrada por ordem crescente de valor.


Exemplo de Entrada
7
8
10
8
260
4
10
10
Exemplo de Saída
4 aparece 1 vez(es)
8 aparece 2 vez(es)
10 aparece 3 vez(es)
260 aparece 1 vez(es)

 */