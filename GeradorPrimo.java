public class GeradorPrimo extends numerosPrimos {

    public int gerarProximoPrimo(int numero) {
        int proximo = numero + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}