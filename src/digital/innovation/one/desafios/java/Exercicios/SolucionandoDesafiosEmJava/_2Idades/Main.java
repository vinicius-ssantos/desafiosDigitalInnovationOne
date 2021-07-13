package digital.innovation.one.desafios.java.Exercicios.SolucionandoDesafiosEmJava._2Idades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        while (true) {
            double valor = scan.nextDouble();
            if (valor < 0.0) {
                break;
            }
            list.add(valor);
        }
        double count = 0;
        double sum = 0;
        double media = 0;
        for (double i : list) {
            sum += i;
            count++;
        }
        media = (sum / count);
        System.out.printf("%.2f" ,media);
    }
}

/*

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor
negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.


Exemplo de Entrada
34
56
44
23
-2

Exemplo de Saída
39.25
 */