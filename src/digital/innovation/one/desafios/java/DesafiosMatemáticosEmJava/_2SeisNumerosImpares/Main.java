package digital.innovation.one.desafios.java.DesafiosMatemáticosEmJava._2SeisNumerosImpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
//        int x = 15;
        int count=0;

        for (int i=x;true;i++){
            if (i%2==1){
                System.out.println(i);
                count++;
            }
            if (count==6){
                break;
            }
        }

    }
}
/*

Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir
de X, um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Dado de entrada:
14
Saída esperada:
15
17
19
21
23
25

 */