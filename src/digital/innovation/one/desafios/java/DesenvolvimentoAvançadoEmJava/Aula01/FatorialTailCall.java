package digital.innovation.one.desafios.java.DesenvolvimentoAvançadoEmJava.Aula01;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor){
        return fatorialComTailCall(valor,1);
    }
    public static double fatorialComTailCall(double valor,double numero){
        if (valor==1){
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }
}
