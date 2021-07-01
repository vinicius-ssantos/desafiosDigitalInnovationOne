package digital.innovation.one.desafios.java.SoluçãoDeProblemasComJava._6ProdutoEDivisão;

public class Main {
}
/*

Desafio
Você tem a obrigação de testar as calculadores, para que façam apenas operações de multiplicação e divisão. Além disso, o termo a ser digitado em cada operação, (o número exibido no visor que será dividido ou multiplicado), só pode conter um único dígito.

Quando ligada, a calculadora exibe o número 1. Após isso, o usuário pode digitar um número com um único dígito e escolher se esse número deve multiplicar ou dividir o número exibido anteriormente; o resultado da operação escolhida é então exibido na calculadora. Pode-se repetir esse processo quantas vezes quiser.

Apesar de ser permitido apenas números inteiros de um dígito, a calculadora permite exibir números com múltiplos dígitos e até mesmo números fracionários.

Apresentada a sequência de operações realizadas logo depois de ligada, seu objetivo é conferir o resultado exibido.

No primeiro caso de teste abaixo, o usuário deseja calcular o resultado da seguinte expressão: 1 × 2 × 1 × 3. Note que a primeira ocorrência do número 1 vem do fato da calculadora mostrar inicialmente 1 ao invés de 0.

No segundo caso de teste abaixo, o usuário deseja calcular o resultado da seguinte expressão: ((1/2)/3) × 6.

Entrada
A primeira e única linha da entrada contém um inteiro N (1 ≤ N ≤ 100 000). Cada uma das próximas N linhas contém um dígito e um caractere '*' ou '/', que representam uma operação realizada na calculadora.

Saída
O programa deve imprimir uma única linha contendo o resultado que deve ser exibido pela calculadora ao final de todas as operações.

##########################################################
Exemplos de Entrada
3
2 *
1 *
3 *
Exemplos de Saída
6
##########################################################
Exemplos de Entrada
3
2 /
3 /
6 *
Exemplos de Saída
1
##########################################################
Exemplos de Entrada
11
9 *
9 *
9 *
9 *
9 *
9 *
9 *
9 *
9 *
9 *
9 /
Exemplos de Saída
387420489
##########################################################
 */