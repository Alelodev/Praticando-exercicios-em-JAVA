public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal(){
        setSaldo(getSaldo() - tarifaMensal);
    }


}
