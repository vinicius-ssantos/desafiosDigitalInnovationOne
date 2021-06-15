package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.List;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //Substitui pela posicao set (set)
        nomes.set(2,"Larissa");
        System.out.println(nomes);

        //Orderna (sort)
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2,"Wesley");
        System.out.println(nomes);

        // remove pelo indice ou pelo objeto ( remove)
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("wesley");
        System.out.println(nomes);
         // size: tamanho da lista
        // contains: elemento dentro da lista, retorna boleano
        // isEmpty: retorna valor boleano se esta vazia
        // clear: esvazia a lista
        //indexOf: passa o elemento e retorna a posicao, se nao houver retorna -1

        //iterator: executa uma ação para cada elemento da colecao

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            if (!iterator.hasNext()){
                iterator.remove();
            }
        }
        System.out.println(nomes);

    }
}
