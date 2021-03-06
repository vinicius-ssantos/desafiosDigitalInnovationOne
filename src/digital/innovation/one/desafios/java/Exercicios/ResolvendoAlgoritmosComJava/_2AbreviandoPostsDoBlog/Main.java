package digital.innovation.one.desafios.java.Exercicios.ResolvendoAlgoritmosComJava._2AbreviandoPostsDoBlog;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> mapWord = new TreeMap<>();
        Map<String, Integer> mapInicial = new TreeMap<>();
        String novaString = "";
        while (true) {
            String casoTeste = scan.nextLine();
            if (casoTeste.contains(".")) {
                break;
            }
            String[] arrCasoTeste = casoTeste.split(" ");
            Iterator<String> iterator = Arrays.stream(arrCasoTeste).iterator();
            while (iterator.hasNext()) {
                String wordTmp = iterator.next();
                int tamanhoWord = wordTmp.length();
                String inicial = Character.toString(wordTmp.charAt(0));
                if (tamanhoWord > 2) {
                    mapWord.put(wordTmp, wordTmp.length());
                }
                List<String> key = new ArrayList<>();
                for (Map.Entry<String, Integer> entry : mapWord.entrySet()) {
                    String atual = String.valueOf(entry.getKey().charAt(0));
                    if (atual.equals(inicial) && entry.getValue() < tamanhoWord) {
                        key.add(entry.getKey());
                    }
                }
                Iterator<String> iterator1 = key.iterator();
                while (iterator1.hasNext()) {
                    mapWord.remove(iterator1.next());
                }
                if (wordTmp.length() > 2) {
                    if (mapInicial.isEmpty()) {
                        mapInicial.put(inicial + ".", wordTmp.length());
                    } else if (mapInicial.containsKey(inicial) && mapInicial.get(inicial) < tamanhoWord) {
                        mapInicial.put(inicial + ".", tamanhoWord);
                    } else {
                        mapInicial.put(inicial + ".", wordTmp.length());
                    }
                }
            }
            mapWord.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            mapInicial.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            int countChar = 0;
            for (int i = 0; i < arrCasoTeste.length; i++) {
                String palavraCasoTeste = arrCasoTeste[i];
                if (mapWord.containsKey(palavraCasoTeste)) {
                    novaString += palavraCasoTeste.charAt(0) + ". ";
                    countChar++;
                } else if (!mapWord.containsKey(palavraCasoTeste)) {
                    novaString += palavraCasoTeste + " ";
                }
            }
            novaString = novaString.substring(0, novaString.length() - 1);
            Iterator<Map.Entry<String, Integer>> iteratorMapWord = mapWord.entrySet().iterator();
            Iterator<Map.Entry<String, Integer>> iteratorMapInicial = mapInicial.entrySet().iterator();
            Map<String, String> mapFinal = new TreeMap<>();
            while (iteratorMapInicial.hasNext()) {
                Map.Entry<String, Integer> atualIteratorMapWord = iteratorMapWord.next();
                Map.Entry<String, Integer> atualIteratorMapInicial = iteratorMapInicial.next();
                for (int i = 0; i < novaString.split(" ").length; i++) {
                    if (atualIteratorMapInicial.getKey().equals(novaString.split(" ")[i])) {
                        mapFinal.put(atualIteratorMapInicial.getKey(), atualIteratorMapWord.getKey());
                    }
                }
            }
            System.out.println(mapFinal);
            System.out.println(mapInicial);
            System.out.println(novaString);
            System.out.println(countChar);
            mapFinal.forEach((key, value) -> System.out.println(key + " = " + value));
            novaString = "";
            mapFinal.clear();
            mapWord.clear();
            mapInicial.clear();
        }
    }
}

/*
Desafio
Leonardo ?? um n??made digital e viaja pelo mundo programando em diferentes caf??s das cidades por
onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experi??ncias e
aprendizados com seus amigos.

Para cria????o do blog, ele optou por utilizar uma ferramenta pronta, que h?? um limite de
caracteres que se pode escrever por dia, e Leonardo est?? preocupado que essa limita????o,
afinal, ir?? impedir de contar suas melhores experi??ncias. Para contornar esse problema,
decidiu usar um sistema de abrevia????o de palavras em seus posts.

O sistema de abrevia????es ?? simples e funciona da seguinte forma: para cada letra, ?? poss??vel
escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a
palavra, sempre que ela aparecer no post, ela ser?? substitu??da por sua letra inicial e um
ponto, diminuindo assim o n??mero de caracteres impressos na tela.

Por exemplo, na frase: ???hoje eu programei em Python???, podemos escolher a palavra ???programei???
para representar a letra ???p', e a frase ficar?? assim: ???hoje eu p. em Python???, economizando
assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e ser??
abreviada todas as vezes. Note que, se ap??s uma abrevia????o o n??mero de caracteres n??o
diminuir, ela n??o deve ser usada, tal como no caso da palavra ???eu??? acima.

Leonardo precisa que seu post tenha o menor n??mero de caracteres poss??veis, e por isso pediu
a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as
abrevia????es, o texto contenha o menor n??mero de caracteres poss??veis.

Entrada
Haver?? diversos casos de teste. Cada caso de teste ?? composto de uma linha, contendo uma
frase de at?? 10??? caracteres. A frase ?? composta de palavras e espa??os em branco, e cada
palavra ?? composta de letras min??sculas ('a'-'z'), e cont??m entre 1 e 30 caracteres cada.

O ??ltimo caso de teste ?? indicado quando a linha dada conter apenas um ???.???, o qual n??o dever??
ser processado.

Sa??da
Para cada caso de teste, imprima uma linha contendo a frase j?? com as abrevia????es escolhidas e
aplicadas.

Em seguida, imprima um inteiro N, indicando o n??mero de palavras em que foram escolhidas uma
letra para a abrevia????o no texto. Nas pr??ximas N linhas, imprima o seguinte padr??o ???C. = P???,
onde C ?? a letra inicial e P ?? a palavra escolhida para tal letra. As linhas devem ser impressas
em ordem crescente da letra inicial.

Dado de entrada:
abcdef abc abc abc
.
Sa??da esperada:
a. abc abc abc
1
a. = abcdef


*/