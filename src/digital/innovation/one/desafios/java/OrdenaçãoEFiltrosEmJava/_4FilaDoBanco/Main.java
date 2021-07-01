package digital.innovation.one.desafios.java.OrdenaçãoEFiltrosEmJava._4FilaDoBanco;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> listSort = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int var1 = scan.nextInt();
        int count = 0;
        while (var1 != count) {
            count++;
            int n1 = scan.nextInt();
            Integer[] listTmp = new Integer[n1];
            for (int i = 0; i < n1; i++) {
                listTmp[i] = scan.nextInt();
            }
            list.add(Arrays.asList(listTmp.clone()));
            listSort.add(Arrays.asList(listTmp.clone()));
        }
        listSort.forEach(Collections::sort);
        listSort.forEach(Collections::reverse);
        int soma = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j).equals(listSort.get(i).get(j))) {
                    soma++;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
/*
Desafio

O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos
clientes.
Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão
uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não
pela ordem de chegada, mas sim pelo número recebido via sms. A ordem de atendimento será
decrescente: aqueles que receberam número maior deverão ser atendidos primeiro.
Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido
via sms, e diga quantos clientes não precisaram trocar de lugar nessa reordenação.

Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.
Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de clientes.
Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica o
número recebido via sms do i-ésimo cliente.
Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao
primeiro cliente a chegar na fila, o segundo inteiro diz respeito ao segundo cliente, e assim
sucessivamente.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de clientes
que não precisaram trocar de lugar mesmo após a fila ser reordenada.

Exemplo de Entrada
3
3
100 80 90
4
100 120 30 50
4
100 90 30 25
Exemplo de Saída
1
0
4

*/