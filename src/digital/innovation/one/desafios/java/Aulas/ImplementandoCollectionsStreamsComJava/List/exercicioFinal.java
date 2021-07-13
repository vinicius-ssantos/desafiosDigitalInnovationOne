package digital.innovation.one.desafios.java.Aulas.ImplementandoCollectionsStreamsComJava.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicioFinal {
    public static void main(String[] args) {
        List<String>  nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String n : nomes){
            System.out.println(n);
        }
        nomes.set(2,"Roberto");
        nomes.get(0);
        nomes.remove(3);
        nomes.remove("João");
        nomes.size();
        nomes.contains("Juliano");

        List<String>  nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println(nomes.isEmpty());




    }
}
