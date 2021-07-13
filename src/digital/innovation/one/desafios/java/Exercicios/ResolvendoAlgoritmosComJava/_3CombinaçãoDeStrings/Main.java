package digital.innovation.one.desafios.java.Exercicios.ResolvendoAlgoritmosComJava._3CombinaçãoDeStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int countValor1 = 0;
        int countValor2 = 0;
        List<String> list = new ArrayList<>();
        int input = Integer.parseInt(scan.nextLine().split(" ")[0]);
        String novaString = new String();
        while (count++ < input) {
            String[] casoTestes = scan.nextLine().split(" ");
            String valor1 = casoTestes[0];
            String valor2 = casoTestes[1];

            while (countValor1 < valor1.length() || countValor2 < valor2.length()) {
                try {
                    novaString+=(valor1.charAt(countValor1));
                } catch (Exception e) {
                    novaString+=("");
                }
                try {
                    novaString+=(valor2.charAt(countValor2));
                } catch (Exception e) {
                    novaString+=("");
                }
                countValor1++;
                countValor2++;
            }
            countValor1=0;
            countValor2=0;
            list.add(novaString);
            novaString="";
        }
        list.forEach(System.out::println);
    }
}
/*

Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras
de cada string.

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda
string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e
retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica
a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha
que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres
inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a
cadeia resultante.


Dado de entrada:
2
aA Bb
aa bb
Saída esperada:
aBAb

Dado de entrada:
3
AoQeaeAADeNtaehchec DguMksuuosoMkNeN
CouLdaaMrde aQearNoo
nWOVQJKKabhiBrPnYvPAwByBmtCPtlrBEovbBMbPtaxraYIIzA PyzAniqSbUBQLxGKacruKWYDIJzxJCKUBNteUdXDoplmnOIYo
Saída esperada:
ADogQueMakesAuAuDoesNotMakeNhecNhec
CaoQueLadraNaoMorde
nPWyOzVAQnJiKqKSabbUhBiQBLrxPGnKYavcPrAuwKBWyYBDmItJCzPxtJlCrKBUEBoNvtbeBUMdbXPDtoapxlrmanYOIIIYzoA
 */