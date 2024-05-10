
public class Main {

    public static void main(String[] args) {
        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas Alves");

        Conta cc = new ContaCorrente(Lucas);
        Conta poupanca = new ContaPoupanca(Lucas);

        cc.depositar(100);
        cc.imprimirExtrato();
        System.out.println();

        cc.transferir(100, poupanca);
        poupanca.imprimirExtrato();
        System.out.println();


        poupanca.transferir(50, cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}