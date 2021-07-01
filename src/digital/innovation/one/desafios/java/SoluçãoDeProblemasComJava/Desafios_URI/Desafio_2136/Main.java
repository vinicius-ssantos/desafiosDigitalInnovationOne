package digital.innovation.one.desafios.java.SoluçãoDeProblemasComJava.Desafios_URI.Desafio_2136;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Inscrito> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Comparator<Inscrito> comp = Comparator.comparing(Inscrito::getOpcaoInt).thenComparing(Inscrito::getNome);
        String amigo ="";
        while (true) {
            String entrada = scan.nextLine();
            if (entrada.equals("FIM")) {
                break;
            }
            String nome = entrada.split(" ")[0];
            String opcao = entrada.split(" ")[1];
            Inscrito inscrito = new Inscrito(nome,opcao);
            list.add(inscrito);
            if (inscrito.opcao.equals("SIM")&&inscrito.nome.length()>amigo.length()){
                amigo = inscrito.getNome();
            }

        }
        list = list.stream().sorted(comp).collect(Collectors.toList());
        for (Inscrito inscrito:list) {

            String inscritoNome = inscrito.getNome().split(" ")[0];
            if (!(list2.contains(inscritoNome))){
                list2.add(inscritoNome);

            }

        }
        list2.forEach(System.out::println);
        System.out.println();
        System.out.println("Amigo do Habay:");
        System.out.println(amigo);
    }
    public static class Inscrito {
        public String nome;
        public String opcao;
        public int opcaoInt;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }
        public int getOpcaoInt() {
            return opcaoInt;
        }
        public Inscrito(String nome, String opcap) {
            this.nome = nome;
            this.opcao = opcap;
            if (opcap.equals("SIM")) {
                this.opcaoInt = 0;
            } else {
                this.opcaoInt = 1;
            }
        }
    }
}



/*

Desafio
Todo final de ano ocorre uma festa na escola. As inscrições para participar da festa são abertas
no início de julho. No momento da inscrição, o aluno pode escolher se quer ser "O Amigo do Pablo"
na festa ou não. O mais lógico seria escolher a opção Sim, afinal, é um privilégio ser O Amigo do
Pablo, já que ele é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente
não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.

Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a opção Sim realizaram
a inscrição diversas vezes para aumentar a própria probabilidade de ser O Amigo do Pablo.
A diretora da escola pediu que você desenvolva um programa que organize as inscrições do site,
pois está havendo um spam de inscrições. O critério para ser o escolhido é a quantidade de letras
do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a inscrição.
A organização final dos inscritos deverá seguir a ordem de escolha (Sim ou Não),
mas respeitando a ordem alfabética.

OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.

Entrada
A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro nome do
participante (sem espaços), seguido da opção SIM (caso o usuário queira ser O Amigo do Pablo)
ou NAO (caso não queira). A entrada termina assim que o usuário digita "FIM" (sem as aspas).

Saída
Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem alfabética,
seguido do nome do vencedor. Imprima uma linha em branco entre a lista de inscritos e o
nome do vencedor.


Exemplo de Entrada
Joao NAO
Carlos SIM
Abner NAO
Samuel SIM
Ricardo NAO
Abhay SIM
Samuel SIM
Andres SIM
Roberto NAO
Carlos SIM
Samuel SIM
Samuel SIM
Abhay SIM
Aline SIM
Andres SIM
FIM
Exemplo de Saída
Abhay
Aline
Andres
Carlos
Samuel
Abner
Joao
Ricardo
Roberto

Amigo do Pablo:
Carlos
 */