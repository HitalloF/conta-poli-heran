public class Corrente extends Conta{
    private int saldo;

    public Corrente(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void view() {
        System.out.println("Seu saldo da corrente é: "+saldo);

    }

    @Override
    public void sacar(int sacar) {
        this.saldo -= sacar;
        System.out.println("Você sacou da conta corrente: "+sacar);
    }
}
