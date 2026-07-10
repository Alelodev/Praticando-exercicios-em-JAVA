public class ConversosDeMoeda implements ConversaoFinanceira{

    private double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    @Override
    public double converteDolarParaReal(double valorEmDolar) {
        double cotacaoDolar = 5.40;
        return valorEmDolar * cotacaoDolar;
    }
}
