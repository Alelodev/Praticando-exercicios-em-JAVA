public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    private double tempEmCelcius;
    private double tempEmFahrenheit;

    public void setTempEmCelcius(double tempEmCelcius) {
        this.tempEmCelcius = tempEmCelcius;
    }

    public void setTempEmFahrenheit(double tempEmFahrenheit) {
        this.tempEmFahrenheit = tempEmFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        double tempCF = (tempEmCelcius * 1.8) + 32;
        return tempCF;
    }

    @Override
    public double fahrenheitParaCelsius() {
        double tempFC = (tempEmFahrenheit - 32) / 1.8;
        return tempFC;
    }
}
