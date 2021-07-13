package digital.innovation.one.desafios.java.Exercicios.ResolvendoAlgoritmosComJava._5OtabuleiroSecreto;


import java.util.*;

public class Main {
    static int n = 0;
    static int q = 0;
    static int[][] matrix = new int[n][n];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;


        String[] entrada = scan.nextLine().split(" ");
        n = Integer.parseInt(entrada[0]);
        matrix = new int[n][n];
        q = Integer.parseInt(entrada[1]);
        while (count++ < q) {
//            System.out.println(count);
            String[] operacao = scan.nextLine().split(" ");
            int valor = Integer.parseInt(operacao[0]);
            int X = Integer.parseInt(operacao[1]);
            int R = 0;
            try {
                R = Integer.parseInt(operacao[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                R = 0;
            }
            if (valor == 1) {
                tipo1(matrix, X, R);
            } else if (valor == 2) {
                tipo2(matrix, X, R);
            } else if (valor == 3) {
                tipo3(matrix, X);
            } else if (valor == 4) {
                tipo4(matrix, X);
            }
        }
        list.forEach(System.out::println);


    }

//    public static void printMatrix(int[][] matrizTmp) {
//        matrizTmp = matrix;
//        for (int i = 0; i < matrizTmp.length; i++) {
//            for (int j = 0; j < matrizTmp.length; j++) {
//                System.out.print(matrizTmp[i][j]);
//            }
//            System.out.println();
//        }
//
//    }

    public static void tipo1(int[][] matrizTmp, int X, int R) {
        matrizTmp = matrix;
        for (int i = 0; i < matrizTmp.length; i++) {
            for (int j = 0; j < matrizTmp.length; j++) {
                if (i == X - 1) {
                    matrizTmp[i][j] = R;
                }
            }
        }
        matrix = matrizTmp;

//        printMatrix(matrix);
//        System.out.println("#################################");
    }

    public static void tipo2(int[][] matrizTmp, int X, int R) {
        matrizTmp = matrix;
        for (int i = 0; i < matrizTmp.length; i++) {
            for (int j = 0; j < matrizTmp.length; j++) {
                if (j == X - 1) {
                    matrizTmp[i][j] = R;
                }
            }
        }
        matrix = matrizTmp;
//        printMatrix(matrix);
//        System.out.println("#################################");

    }

    public static void tipo3(int[][] matrizTmp, int X) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matrizTmp.length; i++) {
            for (int j = 0; j < matrizTmp.length; j++) {
                int valorAtualMatriz = matrizTmp[i][j];
                if (i == X - 1) {
                    if (map.isEmpty()) {
                        map.put(valorAtualMatriz, 1);
                    } else if (map.containsKey(valorAtualMatriz)) {
                        int contem = map.get(valorAtualMatriz) + 1;
                        map.put(valorAtualMatriz, contem);
                    } else {
                        map.put(valorAtualMatriz, 1);
                    }
                }
            }
        }
//        System.out.println(map);
        maiorValor(map);
//        printMatrix(matrix);
//        System.out.println("#################################");

    }

    public static void tipo4(int[][] matrizTmp, int X) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < matrizTmp.length; i++) {
            for (int j = 0; j < matrizTmp.length; j++) {
                int valorAtualMatriz = matrizTmp[i][j];
                if (j == X - 1) {
                    if (map.isEmpty()) {
                        map.put(valorAtualMatriz, 1);
                    } else if (map.containsKey(valorAtualMatriz)) {
                        int contem = map.get(valorAtualMatriz) + 1;
                        map.put(valorAtualMatriz, contem);
                    } else {
                        map.put(valorAtualMatriz, 1);
                    }
                }
            }
        }
//        System.out.println(map);
        maiorValor(map);
//        printMatrix(matrix);
//        System.out.println("#################################");

    }

    public static void maiorValor(Map<Integer, Integer> mapTmp) {
        int maiorValue = 0;
        int maiorKey = 0;
        for (Map.Entry<Integer, Integer> entry : mapTmp.entrySet()) {
            if (entry.getKey() > maiorKey || entry.getValue() > maiorValue) {
                maiorKey = entry.getKey();
                maiorValue = entry.getValue();
            }
        }
//        System.out.println(maiorKey + " <-------> " + maiorValue);
        list.add(maiorKey);


    }
}
//


/*
O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de
tabuleiros do mundo.

Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou
de Tabuleiro da Frequência.

O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo
apenas 0’s. Depois disso, Q operações são propostas, podendo ser de 4 tipos:

1 X R: Atribuir o valor R a todos os números da linha X;

2 X R: Atribuir o valor R a todos os números da coluna X;

3 X: Imprimir o valor mais frequente na linha X;

4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos
melhores programadores do mundo, ele precisa sua ajuda para resolver este problema.

Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando,
respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da
entrada vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação.
Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50).
Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da
resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o
mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os
valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7,
pois é o maior deles.

Dado de entrada:
2 4
1 1 1
2 2 2
3 1
3 2
Saída esperada:
2
2

Dado de entrada:
3 6
1 1 2
1 2 3
1 3 4
4 3
1 3 0
4 3
Saída esperada:
4
3

 */

//        tipo1(matrix, 1, 1);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo2(matrix, 2, 2);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo3(matrix, 1);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo3(matrix, 2);
//        printMatrix(matrix);
//        System.out.println("#########################");

//        tipo1(matrix, 1, 2);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo1(matrix, 2, 3);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo1(matrix, 3,4);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo4(matrix, 3);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo1(matrix, 3,0);
//        printMatrix(matrix);
//        System.out.println("#########################");
//        tipo4(matrix, 3);
//        printMatrix(matrix);
//        System.out.println("#########################");