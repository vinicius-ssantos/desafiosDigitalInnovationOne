package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class exercicioFinal {
    public static void main(String[] args) {
        TreeSet<Integer> lista = new TreeSet<>();
        lista.add(3);
        lista.add(88);
        lista.add(20);
        lista.add(44);
        lista.add(3);
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(lista.pollFirst());
        System.out.println(lista.add(23));
        System.out.println(lista.size());
        System.out.println(lista);

    }
}
