package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula01;

import java.util.Arrays;


public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }
}
