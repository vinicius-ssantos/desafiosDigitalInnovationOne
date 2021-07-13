package digital.innovation.one.desafios.java.Exercicios.OrdenaçãoEFiltrosEmJava._2ComprasNoSupermercado;

import java.util.*;
import java.util.stream.Collectors;


public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorEntrada = scan.nextInt();
        List<String> list = new ArrayList<>();
        List<List> list2 = new ArrayList<>();
        for (int i = 0; i <= valorEntrada; i++) {
            String stringEntrada = scan.nextLine();
            if (!stringEntrada.equals("")) {
                list.add(stringEntrada);
            }
//            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            List listTmp = Arrays.stream(list.get(i).split(" ")).collect(Collectors.toList());
//            System.out.println("############################");
            listTmp = (List) listTmp.stream().distinct().collect(Collectors.toList());
            list2.add(listTmp);
            Collections.sort(list2.get(i));
        }
        for (int i=0;i< list2.size();i++){
            String res = String.join(" ",list2.get(i));
            System.out.println(res);
        }
    }
}
