package java2Pratica2.exercicio01;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 200;

        dividirParte1(a, b);

        try {
            dividirParte2(a, b);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    // Primeira parte do Exercício
    public static void dividirParte1(int a, int b) {
        System.out.println("Primeira parte do Exercício");
        try {
            int resultado = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa Finalizado!");
        }
    }

    //Segunda parte do Exercício
    public static void dividirParte2(int a, int b) throws IllegalArgumentException {
        System.out.println("--------------------------");
        System.out.println("Segunda parte do Exercício");
        try {
            int resultado = b / a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa Finalizado!");
        }
    }
}
