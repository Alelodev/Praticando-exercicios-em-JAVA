public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDetalhesConta(){
        System.out.printf("nome %s %n numero da conta: %s %n saldo: %s %n", titular, numeroDaConta, saldo);
    }
}
