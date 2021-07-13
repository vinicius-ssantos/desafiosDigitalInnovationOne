package digital.innovation.one.desafios.java.Aulas.DesenvolvimentoAvançadoEmJava.Aula03;

public class ThreadExemplo {
    public static void main(String[] args) {
        GerarPDF iniciarGeradorPdf = new GerarPDF();
        BarraDeCarregamento iniciaBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciaBarraDeCarregamento.start();

    }

}

class GerarPDF extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPdf.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


