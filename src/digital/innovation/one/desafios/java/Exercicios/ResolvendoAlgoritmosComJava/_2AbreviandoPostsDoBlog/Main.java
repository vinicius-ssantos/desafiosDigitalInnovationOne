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
Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por
onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e
aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de
caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação,
afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema,
decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível
escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a
palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um
ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei”
para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando
assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será
abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não
diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu
a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as
abreviações, o texto contenha o menor número de caracteres possíveis.

Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma
frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada
palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá
ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e
aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma
letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”,
onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas
em ordem crescente da letra inicial.

Dado de entrada:
abcdef abc abc abc
.
Saída esperada:
a. abc abc abc
1
a. = abcdef


*/