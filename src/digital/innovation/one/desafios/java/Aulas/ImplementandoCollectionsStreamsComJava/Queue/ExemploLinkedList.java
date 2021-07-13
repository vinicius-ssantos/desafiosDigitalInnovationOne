package digital.innovation.one.desafios.java.Aulas.ImplementandoCollectionsStreamsComJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);
        filaBanco.clear();
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
    }
}
