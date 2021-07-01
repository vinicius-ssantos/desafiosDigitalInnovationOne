package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula01;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculaValor = valor ->valor*3;
        int valor = 10;
        System.out.println("O resultaddo é ::"+ calculaValor.apply(10));
    }
}
