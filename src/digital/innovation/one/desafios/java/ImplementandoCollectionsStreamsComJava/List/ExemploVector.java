package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        //Adicione 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Basquetebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("HandeBol");


        //Altera o valor da posicao 2 do vetor
        esportes.set(2,"Ping Pong");

        //Remove o valor da posicao 2
        esportes.remove(2);


        //retorna o primeiro indice do vetor
        System.out.println(esportes.get(0));

        //navega entre os esportes
        for(String esp:esportes){
            System.out.println(esp);
        }

    }
}
