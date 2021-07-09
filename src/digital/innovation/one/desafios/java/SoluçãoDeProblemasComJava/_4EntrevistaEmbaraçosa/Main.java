package digital.innovation.one.desafios.java.SoluçãoDeProblemasComJava._4EntrevistaEmbaraçosa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        String novaPalavra = "";
        String subAtual = "";
        String subPos = "";
        String repete = "";
        while (scan.hasNextLine()) {
            String  palavra = scan.nextLine();
            if (palavra.equals("")) {
                break;
            }else if (palavra==null){
                break;
            }
            for (int i = 0; i <= palavra.length(); i++) {
                for (int j = 0; j <= palavra.length(); j++) {
                    if (!novaPalavra.equals("")) {
                        break;
                    }
                    if (j >= i) {
                        subAtual = palavra.substring(i, j);
                        subPos = palavra.substring(j, palavra.length());
                        if (subAtual.equals(subPos)) {
                            repete = subAtual;
                            novaPalavra = palavra.substring(0, i);
                            novaPalavra += repete;
                            System.out.println(novaPalavra);
                        }
                    }
                }
            }
            subAtual = "";
            subPos = "";
            repete = "";
            novaPalavra = "";
        }
    }
}
/*
Desafio
A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da
cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra
após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo
que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

Entrada
Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada
termina com fim de arquivo.

Saída
Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.


Exemplo de Entrada
sanduicheiche
barrilarril
ratoato
sol
coliseueu
queijoijo
astroastro
a

Exemplo de Saída
sanduiche
barril
rato
sol
coliseu
queijo
astro
a
 */