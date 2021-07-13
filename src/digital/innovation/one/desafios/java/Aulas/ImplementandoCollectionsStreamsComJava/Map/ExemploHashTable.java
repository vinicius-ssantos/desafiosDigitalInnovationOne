package digital.innovation.one.desafios.java.Aulas.ImplementandoCollectionsStreamsComJava.Map;

import java.util.Hashtable;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Marina", 33);
        estudantes.put("Rafael", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro",55);
        System.out.println(estudantes);

        //remove um estudante no indice 0
        estudantes.remove(0);

        System.out.println(estudantes);

    }
}
