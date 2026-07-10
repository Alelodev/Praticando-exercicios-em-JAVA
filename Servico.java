public class Servico implements Vendavel{

    private double valorServico = 0, qntUsada = 0;
    private  double taxa = 0;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getQntUsada() {
        return qntUsada;
    }

    public void setQntUsada(double qntUsada) {
        this.qntUsada = qntUsada;
    }

    @Override
    public double valorTotal() {
        double valorSxQ = (qntUsada * valorServico) + taxa;
        return valorSxQ;
    }
}
