package digital.innovation.one.desafios.java.Exercicios.SoluçãoDeProblemasComJava._5ConjuntosBonsOuRuins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String classConjunto = "";
        String conjunto = "";
        while (true) {
            int entrada = scan.nextInt();
            if (entrada == 0) {
                break;
            }
            for (int i = 1; i <= entrada; i++) {
                conjunto = scan.next();
                list.add(conjunto);
                if (i == entrada) {
                    for (String s1 : list) {
                        for (String s2 : list) {
                            if (s1.contains(s2) && !(s1.equals(s2))) {
                                classConjunto = "Conjunto Ruim";
                            } else if (!classConjunto.equals("Conjunto Ruim")){
                                classConjunto = "Conjunto Bom";
                            }
                        }
                    }
                    System.out.println(classConjunto);
                    list.clear();
                    classConjunto="";
                }
            }
        }
    }
}
/*

Desafio
Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição,
um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário,
é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. Quando duas
palavras são idênticas, definimos como uma sendo prefixo da outra.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro
N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. Segue então N linhas, cada
uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve
ser processada.

Saída
Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado
acima.


Exemplo de Entrada
3
abc
dae
abcde
2
abc
def
0

Exemplo de Saída
Conjunto Ruim
Conjunto Bom

 */