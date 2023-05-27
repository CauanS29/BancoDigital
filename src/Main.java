import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Cauan");

        Cliente c2 = new Cliente();
        c2.setNome("alguém");

        Conta cc = new ContaCorrente(c2);
        Conta poupanca = new ContaPoupanca(c1);
        cc.depositar(100);
        cc.tranfesrir(50, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}