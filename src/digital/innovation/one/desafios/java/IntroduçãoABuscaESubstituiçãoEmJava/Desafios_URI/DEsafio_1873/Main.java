package digital.innovation.one.desafios.java.IntroduçãoABuscaESubstituiçãoEmJava.Desafios_URI.DEsafio_1873;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner bf = new Scanner(System.in);
        String rajesh = "";
        String sheldon = "";
        int count = bf.nextInt();
        int fim=0;
        while (fim!=count) {
            fim++;
            rajesh = bf.next();
            if ((rajesh == null)) {
                break;
            } else if (rajesh.equals("")) {
                break;
            }
            sheldon = bf.next();
            var result = "";
            result = (rajesh.equals("tesoura") && sheldon.equals("papel")) ? "rajesh" :
                    (rajesh.equals("papel") && sheldon.equals("pedra")) ? "rajesh" :
                            (rajesh.equals("pedra") && sheldon.equals("lagarto")) ? "rajesh" :
                                    (rajesh.equals("lagarto") && sheldon.equals("spock")) ? "rajesh" :
                                            (rajesh.equals("spock") && sheldon.equals("tesoura")) ? "rajesh" :
                                                    (rajesh.equals("tesoura") && sheldon.equals("lagarto")) ? "rajesh" :
                                                            (rajesh.equals("lagarto") && sheldon.equals("papel")) ? "rajesh" :
                                                                    (rajesh.equals("papel") && sheldon.equals("spock")) ? "rajesh" :
                                                                            (rajesh.equals("spock") && sheldon.equals("pedra")) ? "rajesh" :
                                                                                    (rajesh.equals("pedra") && sheldon.equals("tesoura")) ? "rajesh" :
                                                                                            (rajesh.equals(sheldon)) ? "empate" : "sheldon";
            System.out.println(result);
        }
    }
}
/*
Rolien e Naej são os desenvolvedores de um grande portal de programação. Para ajudar no novo
sistema de cadastro do site, eles requisitaram a sua ajuda. Seu trabalho é fazer um código
que valide as senhas que são cadastradas no portal, para isso você deve atentar aos requisitos
a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.
Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma
string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos
requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não
forem atendidos.

Dado de entrada:
3
spock spock
tesoura spock
lagarto spock
Saída esperada:
empate
sheldon
rajesh
*/