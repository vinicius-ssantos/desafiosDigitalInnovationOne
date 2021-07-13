package digital.innovation.one.desafios.java.Aulas.ImplementandoCollectionsStreamsComJava.Map;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a ultima capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + " -> " + treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no topo da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + " -> " + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " -> " + treeCapitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " -> " + treeCapitais.higherEntry("SC").getValue());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Nevega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " -> " + treeCapitais.get(key));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " --> " + treeCapitais.get(capital));
        }

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " ---> " + capital.getValue());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
