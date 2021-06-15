package digital.innovation.one.desafios.java.ImplementandoCollectionsStreamsComJava.Map;


import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeosMundiasFifa = new HashMap<>();

        //Adiciona os campẽos mundiais fifa no mapa
        campeosMundiasFifa.put("Brasil", 5);
        campeosMundiasFifa.put("Alemanha", 4);
        campeosMundiasFifa.put("Itália", 4);
        campeosMundiasFifa.put("Uruguai", 2);
        campeosMundiasFifa.put("Argentina", 2);
        campeosMundiasFifa.put("França", 2);
        campeosMundiasFifa.put("Inglaterra", 1);
        campeosMundiasFifa.put("Espanha", 1);

        System.out.println(campeosMundiasFifa);

        //Atualiza o valor  para a chave Brasil
        campeosMundiasFifa.put("Brasil", 6);

        System.out.println(campeosMundiasFifa);

        //Retorna Argentina
        System.out.println(campeosMundiasFifa.get("Argentina"));

        //Retorna se existe ou nao um campẽao França
        System.out.println(campeosMundiasFifa.containsKey("França"));

        // Remove o campeão França
        campeosMundiasFifa.remove("França");

        //Retorna se existe ou nao um campẽao França
        System.out.println(campeosMundiasFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeosMundiasFifa.containsValue(6));

        //Reotrna o tamanho do mapa
        System.out.println(campeosMundiasFifa.size());

        System.out.println(campeosMundiasFifa);

        //Nevega nos registro do mapa
        for (Map.Entry<String, Integer> entry : campeosMundiasFifa.entrySet()) {
            System.out.println(entry.getKey() + " <--> " + entry.getValue());
        }
        System.out.println("####################################################");
        //Navega nos registros do mapa
        for (String key : campeosMundiasFifa.keySet()) {
            System.out.println(key + " <----> " + campeosMundiasFifa.get(key));
        }

        System.out.println(campeosMundiasFifa);

        // Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeosMundiasFifa.containsKey(" Estados Unidos"));

        // Verifica se o mapa contem o valor5
        System.out.println(campeosMundiasFifa.containsValue(5));

        //Verifica o tamanho antes e depois do mapa
        System.out.println(campeosMundiasFifa.size());

        campeosMundiasFifa.clear();

        System.out.println(campeosMundiasFifa.size());


    }


}
