public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus");
        Conta minhaContaCorrente = new ContaCorrente(cliente);
        Conta minhaContaPoupanca = new ContaPoupanca(cliente);

        minhaContaCorrente.depositar(300);
        minhaContaPoupanca.depositar(500);
        minhaContaCorrente.transferir(minhaContaPoupanca, 300);

        minhaContaCorrente.imprimirExtrato();
        minhaContaPoupanca.imprimirExtrato();

    }
}
