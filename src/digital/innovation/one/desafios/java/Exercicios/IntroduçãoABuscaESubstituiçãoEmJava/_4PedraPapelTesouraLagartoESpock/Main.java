package digital.innovation.one.desafios.java.Exercicios.IntroduçãoABuscaESubstituiçãoEmJava._4PedraPapelTesouraLagartoESpock;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner bf = new Scanner(System.in);
        String fernanda = "";
        String marcia = "";
        int count = bf.nextInt();
        int fim=0;
        while (fim!=count) {
            fim++;
            fernanda = bf.next();
            if ((fernanda == null)) {
                break;
            } else if (fernanda.equals("")) {
                break;
            }
            marcia = bf.next();
            var result = "";
            result = (fernanda.equals("tesoura") && marcia.equals("papel")) ? "fernanda" :
                    (fernanda.equals("papel") && marcia.equals("pedra")) ? "fernanda" :
                            (fernanda.equals("pedra") && marcia.equals("lagarto")) ? "fernanda" :
                                    (fernanda.equals("lagarto") && marcia.equals("spock")) ? "fernanda" :
                                            (fernanda.equals("spock") && marcia.equals("tesoura")) ? "fernanda" :
                                                    (fernanda.equals("tesoura") && marcia.equals("lagarto")) ? "fernanda" :
                                                            (fernanda.equals("lagarto") && marcia.equals("papel")) ? "fernanda" :
                                                                    (fernanda.equals("papel") && marcia.equals("spock")) ? "fernanda" :
                                                                            (fernanda.equals("spock") && marcia.equals("pedra")) ? "fernanda" :
                                                                                    (fernanda.equals("pedra") && marcia.equals("tesoura")) ? "fernanda" :
                                                                                            (fernanda.equals(marcia)) ? "empate" : "marcia";
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

Exemplo de Entrada
3
spock spock
tesoura spock
lagarto spock

Exemplo de Saída
empate
sheldon
rajesh
*/