package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula01;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificaSeEMaior.test(13, 12));

    }
}
