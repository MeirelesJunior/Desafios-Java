public class teste {
    public static void main(String[] args) {

        Cliente jorge = new Cliente();
        jorge.setNome("Jorge Meireles");

        Cliente julio = new Cliente();
        julio.setNome("Julio Meireles");

        Conta cc = new ContaCorrente(jorge);
        Conta cp = new ContaPoupanca(julio);

        cc.depositar(1000);
        cc.transferir(700, cp);

        cc.imprimirInfosComuns();
        cp.imprimirInfosComuns();

    }
}
