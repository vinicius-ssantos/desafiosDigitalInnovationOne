package digital.innovation.one.desafios.java.SoluçãoDeProblemasComJava._3MelhorAmigoDoPablo;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
//        Comparator comp = Comparator.comparing(Inscrito::getOpcaoInt).thenComparing(Inscrito::getNome);
//        Comparator comp2 = Comparator.comparing(Opcao::getOpcaoInt).thenComparing(Nome::getNome);
        Scanner scan = new Scanner(System.in);
//        List<Inscrito> list = new ArrayList<>();
        Map<Nome,Opcao> map = new TreeMap<>();
        while (true) {
            String entrada = scan.nextLine();
            if (entrada.equals("FIM")) {
                break;
            }
            String nome = entrada.split(" ")[0];
            String opcao = entrada.split(" ")[1];
//            list.add(new Inscrito(nome, opcao));
        }
//        list.stream().sorted(comp).forEach(System.out::println);
    }



    public static class Nome {
        public String nome;

        public String getNome() {
            return nome;
        }

        public Nome(String nome) {
            this.nome = nome;
        }
        @Override
        public String toString() {
            return this.nome;
        }
    }
    public static class Opcao {
        public String opcao;
        public int opcaoInt;

        public int getOpcaoInt() {
            return opcaoInt;
        }

        public String getOpcao() {
            return opcao;
        }

        public Opcao(String opcao) {
            this.opcao = opcao;
            if (opcao.equals("SIM")) {
                this.opcaoInt = 0;
            } else {
                this.opcaoInt = 1;
            }
        }
        @Override
        public String toString() {
            return this.opcao;
        }
    }
}