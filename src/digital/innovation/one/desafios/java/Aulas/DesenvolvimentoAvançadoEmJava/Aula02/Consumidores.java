package digital.innovation.one.desafios.java.Aulas.DesenvolvimentoAvançadoEmJava.Aula02;

import java.util.function.Consumer;

public class Consumidores {
	public static void main(String[] args) {
		
//    -apenas
//	  -utilizar o parametro da forma que ele foi recebido;
		
		
	Consumer<String> imprimirUmaFrase = System.out::println;
		
//		Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
		imprimirUmaFrase.accept("Hello world");

	}
}
