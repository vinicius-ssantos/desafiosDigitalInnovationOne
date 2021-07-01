package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exercicioFinal {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(nomes.element());
        System.out.println(nomes.remove());
        System.out.println(nomes.add("Daniel"));
        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Carlos "));

    }
}
