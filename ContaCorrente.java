public class ContaCorrente {
  private Cliente cliente;
  private double saldo;

    public ContaCorrente(Cliente cliente) {
      this.cliente = cliente;
      this.saldo = 0.0;
    }

    public void depositar(double valor) {
      this.saldo += valor;
    }
}