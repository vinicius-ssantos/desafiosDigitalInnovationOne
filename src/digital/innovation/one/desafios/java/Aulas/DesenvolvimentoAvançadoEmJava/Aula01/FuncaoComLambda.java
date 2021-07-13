package digital.innovation.one.desafios.java.Aulas.DesenvolvimentoAvançadoEmJava.Aula01;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao ColocarPrefixo = valor ->"Sr. "+valor;
        System.out.println(ColocarPrefixo.gerar("João"));
    }
}

@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}
