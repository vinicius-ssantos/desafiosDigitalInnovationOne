package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercicioFinal {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        estudantes.add("Jonathan");
        estudantes.add("Felipe");
        estudantes.add("Clovis");
        estudantes.add("Rubens");
        estudantes.add("Maycon");
        estudantes.add("Wesley");

        // A
        System.out.println(estudantes.stream()
                .collect(Collectors.toList()));

    }
}
