public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void tranfesrir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
