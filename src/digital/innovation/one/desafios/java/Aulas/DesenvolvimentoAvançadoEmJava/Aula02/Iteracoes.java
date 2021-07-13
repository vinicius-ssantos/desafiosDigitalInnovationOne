package digital.innovation.one.desafios.java.Aulas.DesenvolvimentoAvançadoEmJava.Aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        // imprimeNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente do Projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }

    public static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")) {
                nomesParaImprimir += " " + nomes[i];
            }
        }

        System.out.println(nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining()); // String

        System.out.println("Nomes do Stream " + nomesParaImprimirDaStream);

//      String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("João"))
//        .collect(Collectors.joining());
//        System.out.println(nomesResultados);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("imprime pelo for: "+nome);
        }
        Stream.of(nomes)
                .forEach(nome->System.out.println("Imprime pelo forEach: "+nome));

    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }
        Stream.of(numeros).map(numero->numero*2)
                           .forEach(System.out::println);
    }
}
