public class CalculadoraSalaRetangular implements CalculoGeometrico{

    double base = 0, altura = 0, Area = 0, perimetro = 0;

    @Override
    public double calcularArea() {
        return Area = base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return perimetro = 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
