public class TabuadaMultiplicacao implements Tabuada {
    private double nMultiplicavel;

    public void tabuada(){
        for (int i = 1; i <= 10; i++) {
            double multiplicacao = nMultiplicavel * i;
            System.out.println(multiplicacao);
        }
    }

    @Override
    public void mostrarTabuada() {
        tabuada();
    }

    public double getnMultiplicavel() {
        return nMultiplicavel;
    }

    public void setnMultiplicavel(double nMultiplicavel) {
        this.nMultiplicavel = nMultiplicavel;
    }

}
