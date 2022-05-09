public class Main {
    public static void main(String[] args) {

    Corrente cc = new Corrente(140);
    cc.view();
    Poupanca p = new Poupanca(200);
    p.view();
    cc.sacar(85);
    p.sacar(90);
    cc.view();
    p.view();


    }
}
