package digital.innovation.one.desafios.java.Exercicios.IntroduçãoABuscaESubstituiçãoEmJava._3ValidadorDeSenhasComRequisitos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int countMin = 0, countMaius = 0, countNum = 0, countNeg = 0;
        String senhaPos;
        while (true) {
            senhaPos = scan.readLine();
            if ((senhaPos == null)) {
                break;
            } else if (senhaPos.equals("")) {
                break;
            }
            for (int i = 0; i < senhaPos.length(); i++) {
                char s = senhaPos.charAt(i);
                String s1 = Character.toString(s);
                if (s1.matches("[a-z]")) {
                    countMin++;
                }
                if (s1.matches("[A-Z]")) {
                    countMaius++;
                }
                if (s1.matches("[0-9]")) {
                    countNum++;
                }
                if (s1.matches("[^a-zA-Z0-9]")) {
                    countNeg++;
                }
            }
            if (countMin > 0 && countMaius > 0 && countNum > 0 && countNeg == 0 &&
                                senhaPos.length() >= 6 && senhaPos.length() <= 32) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
            countMin = 0;
            countMaius = 0;
            countNum = 0;
            countNeg = 0;

        }
    }
}

//                System.out.println("Senha valida.");
//
//                System.out.println("Senha invalida.");


/*

Desafio
Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de
cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são
cadastradas, para isso você deve atentar aos requisitos a seguir:

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
Digital Innovation One
AbcdEfgh99
DigitalInnovationOne123
Digital Innovation One 123
Aass9
Aassd9

Saída esperada:
Senha invalida.
Senha valida.
Senha valida.
Senha invalida.
Senha invalida.
Senha valida.

Dado de entrada:
DIO123456
Ano2020
Digita!123
Saída esperada:
Senha invalida.
Senha valida.
Senha invalida.
 */