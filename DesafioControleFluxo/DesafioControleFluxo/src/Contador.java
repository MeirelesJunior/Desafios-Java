import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int parametroUm = leitor.nextInt();

        System.out.println("Informe o segundo número:");
        int parametroDois = leitor.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    // metodo para contar
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        // int contagem = parametroDois - parametroUm;
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
