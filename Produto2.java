public class Produto2 implements Vendavel{

    private double valorProduto = 0, qntProduto = 0;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(double qntProduto) {
        this.qntProduto = qntProduto;
    }

    @Override
    public double valorTotal() {
        double valorQxV = qntProduto * valorProduto;
        return valorQxV;
    }
}
