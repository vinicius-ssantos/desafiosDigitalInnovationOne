package digital.innovation.one.desafios.java.Aulas.DesenvolvimentoAvançadoEmJava.Aula02;


import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("João"));

    }
}
