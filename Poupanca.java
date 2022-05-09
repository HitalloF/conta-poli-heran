public class Poupanca extends Conta{
    private int saldo;

    public Poupanca(int saldo){
        this.saldo = saldo;
    }

    @Override
    public void view() {
        System.out.println("Seu saldo na poupança é: "+ this.saldo);
    }

    @Override
    public void sacar(int sacar) {
        this.saldo -= sacar;
        System.out.println("VocÊ sacou da poupança: "+ sacar);
    }
}
