package digital.innovation.one.desafios.java.Aulas.ImplementandoCollectionsStreamsComJava.Comparators.ExercicioFinal;

public class Menines implements Comparable<Menines> {
    private final String nome;
    private final Integer idade;

    public Menines(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - " + "Idade: " + idade;
    }


    @Override
    public int compareTo(Menines o) {
        return this.getIdade() - o.getIdade();
    }


}