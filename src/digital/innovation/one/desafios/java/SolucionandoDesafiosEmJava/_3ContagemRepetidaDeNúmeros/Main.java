package digital.innovation.one.desafios.java.SolucionandoDesafiosEmJava._3ContagemRepetidaDeNúmeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), D = scan.nextInt();
        int diferenca = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + diferenca);
    }
}
/*

Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.


Exemplos de Entrada
5
6
7
8
Exemplos de Saída
DIFERENCA = -26

Exemplos de Entrada
0
0
7
8
Exemplos de Saída
DIFERENCA = -56

Exemplos de Entrada
5
6
-7
8
Exemplos de Saída
DIFERENCA = 86

 */