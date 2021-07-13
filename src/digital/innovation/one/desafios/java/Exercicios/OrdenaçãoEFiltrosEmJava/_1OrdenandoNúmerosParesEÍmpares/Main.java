package digital.innovation.one.desafios.java.Exercicios.OrdenaçãoEFiltrosEmJava._1OrdenandoNúmerosParesEÍmpares;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int valor = scan.nextInt();
        while (true) {
            if (list.size() == valor) {
                break;
            } else {
                list.add(scan.nextInt());
            }
        }
//        list.add(4);
//        list.add(32);
//        list.add(34);
//        list.add(543);
//        list.add(3456);
//        list.add(654);
//        list.add(567);
//        list.add(87);
//        list.add(6789);
//        list.add(98);
//        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        list2 = list.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
//        System.out.println(list1);
//        System.out.println(list2);
        list.clear();
        list1= list1.stream().sorted().collect(Collectors.toList());
        list2= list2.stream().sorted().collect(Collectors.toList());
        Collections.reverse(list2);

        list.addAll(list1);
        list.addAll(list2);
        list.forEach(x-> System.out.println(x));

//        esperado
//        4
//        32
//        34
//        98
//        654
//        3456
//        6789
//        567
//        543
//        87


//        10
//        4
//        32
//        34
//        543
//        3456
//        654
//        567
//        87
//        6789
//        98





    }
}
