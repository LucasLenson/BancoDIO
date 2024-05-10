public abstract class Conta implements IConta{

    private static final int AGENCIA_FINAL= 1;
    private static int SEQ = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_FINAL;
        this.numero = SEQ++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void exibirDados() {
        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Agencia: %d%n", agencia);
        System.out.printf("Numero: %d%n", numero);
        System.out.printf("Saldo: %.2f%n", saldo);
    }

}
