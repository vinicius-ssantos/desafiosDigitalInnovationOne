//NAO TERMINEI
//package digital.innovation.one.desafios.java.ResolvendoAlgoritmosComJava._2AbreviandoPostsDoBlog;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main2 {
//    static List<Object[]> list = new ArrayList<>();
//    static Iterator<Object[]> iterator = list.listIterator();
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        while (true) {
//            String casoTeste = scan.nextLine();
//            if (casoTeste.contains(".")) {
//                break;
//            }
//            Palavra abreviacao = new Palavra(casoTeste);
//            System.out.println(abreviacao);
//
//
//        }
//    }
//
//
//    public static class Palavra {
//        public String casoTeste;
//        public String[] casoTesteArray;
//
//
//        public Palavra(String casoTeste) {
//            this.casoTeste = casoTeste;
//            this.casoTesteArray = new String[casoTeste.split(" ").length];
//            for (int i = 0; i < casoTeste.split(" ").length; i++) {
//                this.casoTesteArray[i] = casoTeste.split(" ")[i];
//            }
//        }
//
//
//        @Override
//        public String toString() {
//            return "Palavra{" +
//                    "casoTeste='" + casoTeste + '\'' +
//                    ", casoTesteArray=" + Arrays.toString(casoTesteArray) +
//                    '}';
//        }
//    }
//
//    public static String stringAbreviada(String[] casoArray) {
//        String stringTmp = "";
//        String arrayTmp[] = new String[casoArray.length];
//        int countIndex = 0;
//        String contem = "";
//        Iterator<String> iterator = Arrays.stream(arrayTmp).iterator();
//        for (int i = 0; i <= casoArray.length; i++) {
//            for (int j = 0; j < casoArray.length; j++) {
//                if (casoArray[i].length() > 2 || casoArray[j].length() > 2) {
//                    if (casoArray[i].charAt(0) == casoArray[j].charAt(0) && casoArray[i].length() > casoArray[j].length()) {
//                        stringTmp = casoArray[i];
//                    } else if (casoArray[i].charAt(0) == casoArray[j].charAt(0) && casoArray[i].length() < casoArray[j].length()) {
//                        stringTmp = casoArray[j];
//                    }
//                    for (String s : arrayTmp) {
//                        if (s.equals(stringTmp)) {
//                            contem = "contem";
//                        }
//                    }
//                    if (!contem.equals("contem")) {
//                        arrayTmp[countIndex] = stringTmp;
//                        countIndex++;
//                    }
//                    contem="";
//                }
//            }
//        }
//
//
//    }
//
//}
