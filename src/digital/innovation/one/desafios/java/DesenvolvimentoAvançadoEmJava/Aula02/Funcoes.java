package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula02;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("João"));
        System.out.println(converterStringParaInteiroECalculaODobro.apply("20"));

    }

}
