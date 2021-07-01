package digital.innovation.one.desafios.java.FundamentosAritmeticosEmJava._1QuantidadeDeNúmerosPositivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            double valor = scan.nextDouble();
            if (valor>0)
                list.add(valor);
        }
        System.out.println(list.size()+" valores positivos");
    }
}
//        7
//        -5
//        6
//        -3.4
//        4.6
//        12


//        70
//        67
//        77
//        99
//        23
//        1