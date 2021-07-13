package digital.innovation.one.desafios.java.Exercicios.IntroduçãoABuscaESubstituiçãoEmJava._2EncontreAMaiorSubstring;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainCerta {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String string1, string2, maiorString, menorString;

        while (true) {
            string1 = scan.readLine();
            if ((string1 == null)) {
                break;
            }else  if(string1.equals("")){
                break;
            }
            string2 = scan.readLine();
            if (string1.length() > string2.length()) {
                maiorString = string1;
                menorString = string2;
            } else {
                maiorString = string2;
                menorString = string1;
            }
            int maior = 0;
            for (int i = 0; i <= menorString.length(); i++) {
                for (int j = 0; j <= menorString.length(); j++) {
                    if (i < j) {
                        boolean contem = maiorString.contains(menorString.substring(i, j));
                        String contemString = menorString.substring(i, j);
                        if (contem) {
                            if (contemString.length()>maior){
                                maior++;
                            }
                        }
                    }
                }
            }
            System.out.println(maior);
        }
    }
}

//        String s1, s2, max, min;
//        while ((s1 = in.readLine()) != null) {
//            s2 = in.readLine();
//            if (s1.length() >= s2.length()) {
//                max = s1;
//                min = s2;
//            } else {
//                max = s2;
//                min = s1;
//            }
//            int minLength = min.length();
//            int maxS = minLength;
//            boolean f = true;
//            while (maxS > 0 && f) {
//                int diff = minLength - maxS;
//                for (int i = 0; i <= diff; i++) {
//                    if (max.contains(min.substring(i, i + maxS))) {
//                        f = false;
//                        maxS++;
//                        break;
//                    }
//                }
//                maxS--;
//            }
//            System.out.println(maxS);
//        }
//        out.close();
//    }


/*
Desafio
Encontre a maior substring comum entre as duas strings informadas. A substring pode ser
qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída
deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas,
cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres
('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
O tamanho da maior subsequência comum entre as duas Strings.


Dado de entrada:
abcdef
cdofhij
TWO
FOUR
abracadabra
open
Hey This java is hot
Java is a new paradigm

Saída esperada:
2
1
0
7


 */


//public class Main2 {


