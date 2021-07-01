package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula02;

public class FuncaoAltaOrdem {
	public static void main(String[] args) {

		Calculo soma = (a, b) -> a + b;
		Calculo subtracao = (a, b) -> a - b;
		Calculo divisao = (a, b) -> a / b;
		Calculo mult = (a, b) -> a * b;

		System.out.println(executarOperacao(soma, 1, 3));
		System.out.println(executarOperacao(subtracao, 1, 3));
		System.out.println(executarOperacao(divisao, 1, 3));
		System.out.println(executarOperacao(mult, 1, 3));
	}

	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
}

// POR PARAMETRO RECEBE OUTRA FUNCAO
// OU Q ELA RETORNA UMA FUNCAO
