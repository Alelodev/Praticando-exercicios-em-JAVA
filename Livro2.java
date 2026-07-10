public class Livro2 implements Calculavel {

    private String livrodefantasia;
    private double valorLivro;
    private double qntLivreo;

    public String getLivrodefantasia() {
        return livrodefantasia;
    }

    public void setLivrodefantasia(String livrodefantasia) {
        this.livrodefantasia = livrodefantasia;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    public double getQntLivreo() {
        return qntLivreo;
    }

    public void setQntLivreo(double qntLivreo) {
        this.qntLivreo = qntLivreo;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinalL = qntLivreo * valorLivro;
        return precoFinalL;
    }
}
