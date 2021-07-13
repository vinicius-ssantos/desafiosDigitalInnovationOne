package digital.innovation.one.desafios.java.Exercicios.IntroduçãoABuscaESubstituiçãoEmJava._2EncontreAMaiorSubstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String string1;
        String string2;
        List<String> subStrings1 = new ArrayList<>();
        List<String> subStrings2 = new ArrayList<>();

        while (true) {
            string1 = scan.readLine();
            if ((string1==null)){
                scan.close();
                break;
            }
            string2 = scan.readLine();
            for (int i = 0; i <= string1.length(); i++) {
                for (int j = 0; j <= string1.length(); j++) {
                    if (i < j) {
//                        System.out.println(string1.substring(i, j));
                        subStrings1.add(string1.substring(i, j));
                    }
                }
            }
//            System.out.println(subStrings1);
            for (int i = 0; i <= string2.length(); i++) {
                for (int j = 0; j <= string2.length(); j++) {
                    if (i < j) {
//                        System.out.println(string2.substring(i, j));
                        subStrings2.add(string2.substring(i, j));
                    }
                }
            }
//            System.out.println(subStrings2);
            int maior = 0;
            for (String s1 : subStrings1) {
                for (String s2 : subStrings2) {
                    if (s1.equals(s2)) {
                        if (s1.length() > maior) {
                            maior = s1.length();
                        }
                    }
                }
            }
            System.out.println(maior);
            subStrings1.clear();
            subStrings2.clear();
        }
    }
}

/*
Desafio
Encontre a maior substring comum entre as duas strings informadas. A substring pode ser
qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída
deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas,
cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres
('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
O tamanho da maior subsequência comum entre as duas Strings.


Dado de entrada:
abcdef
cdofhij
TWO
FOUR
abracadabra
open
Hey This java is hot
Java is a new paradigm

Saída esperada:
2
1
0
7


 */