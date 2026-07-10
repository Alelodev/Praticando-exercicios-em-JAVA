public class ProdutoFisico implements Calculavel{

    private double pneu = 0;
    private double qntDeProduto = 0;

    public double getPneu() {
        return pneu;
    }

    public void setPneu(double pneu) {
        this.pneu = pneu;
    }

    public double getQntDeProduto() {
        return qntDeProduto;
    }

    public void setQntDeProduto(double qntDeProduto) {
        this.qntDeProduto = qntDeProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinalP = pneu * qntDeProduto;
        return precoFinalP;
    }
}
