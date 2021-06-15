package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Comparators.ExercicioFinal;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exercicioFinal {
    public static void main(String[] args) {

        List<Menines> menines = new ArrayList<>();

        menines.add(new Menines("Wesley", 199));
        menines.add(new Menines("Jonatan", 20));
        menines.add(new Menines("Gaybriel", 15));
        menines.add(new Menines("Milton", 18));
        menines.add(new Menines("Renato", 22));

        System.out.println(menines);
        menines.sort((primeiro,segundo) -> primeiro.getIdade() - segundo.getIdade());
        System.out.println(menines);
        menines.sort(Comparator.comparingInt(Menines::getIdade));
        System.out.println(menines);
        menines.sort(Comparator.comparingInt(Menines::getIdade).reversed());
        System.out.println(menines);
        Collections.sort(menines,new MenineOrdemReversa());
        System.out.println(menines);
    }


}

