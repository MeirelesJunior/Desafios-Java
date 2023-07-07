import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, informe o seu nome:");
        nomeCliente = leitor.next();

        System.out.println("Informe a sua agência:");
        agencia = leitor.next();

        System.out.println("Informe o número da sua conta:");
        numeroConta = leitor.nextInt();

        System.out.println("Informe o seu saldo:");
        saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
