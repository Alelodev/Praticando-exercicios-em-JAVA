public class main4 {
    static void main() {
        ConversosDeMoeda conversor = new ConversosDeMoeda();
        double resultado = conversor.converteDolarParaReal(10);
        System.out.println("R$ " + resultado);

        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();
        retangulo.setAltura(10);
        retangulo.setBase(2);

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

        TabuadaMultiplicacao n1 = new TabuadaMultiplicacao();
        n1.setnMultiplicavel(22);
        n1.mostrarTabuada();

        ConversorTemperaturaPadrao tempC = new ConversorTemperaturaPadrao();
        tempC.setTempEmCelcius(22.4);
        System.out.println(tempC.celsiusParaFahrenheit());

        ConversorTemperaturaPadrao tempF = new ConversorTemperaturaPadrao();
        tempF.setTempEmFahrenheit(80.8);
        System.out.println(tempF.fahrenheitParaCelsius());


        Livro2 hp = new Livro2();
        hp.setLivrodefantasia("Harry Potter");
        hp.setValorLivro(74.99);
        hp.setQntLivreo(5);
        System.out.println(hp.calcularPrecoFinal());

        ProdutoFisico pneu = new ProdutoFisico();
        pneu.setPneu(99.99);
        pneu.setQntDeProduto(2);
        System.out.println(pneu.calcularPrecoFinal());

        Servico pedreiro = new Servico();
        pedreiro.setQntUsada(15);
        pedreiro.setValorServico(200);
        pedreiro.setTaxa(pedreiro.getValorServico() * 0.90);
        System.out.println(pedreiro.valorTotal());

        Produto2 arroz = new Produto2();
        arroz.setQntProduto(5);
        arroz.setValorProduto(4.99);
        System.out.println(arroz.valorTotal());

    }
}
