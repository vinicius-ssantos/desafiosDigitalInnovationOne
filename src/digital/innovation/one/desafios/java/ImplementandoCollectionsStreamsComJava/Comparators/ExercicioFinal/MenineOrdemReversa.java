package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Comparators.ExercicioFinal;


import java.util.Comparator;

public class MenineOrdemReversa implements Comparator<Menines> {
    @Override
    public int compare(Menines o1, Menines o2) {
        return o2.getIdade() - o1.getIdade();
    }
}