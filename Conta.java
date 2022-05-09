public class Conta {
    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public void view(){
        System.out.println("Seu saldo:"+ saldo);
    }

    public void sacar(int sacar){
        this.saldo -= sacar;
        System.out.println("Você sacaou: "+sacar);
    }




}
