public class Livro {
    private String nomeLivro;
    private String autorDoLivro;
    private int qntDePaginas;

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutorDoLivro() {
        return autorDoLivro;
    }

    public int getQntDePaginas() {
        return qntDePaginas;
    }

    public void setAutorDoLivro(String autorDoLivro) {
        this.autorDoLivro = autorDoLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setQntDePaginas(int qntDePaginas) {
        this.qntDePaginas = qntDePaginas;
    }

    public void detalhesLivro(){
        System.out.println("Autor do livro: " + autorDoLivro + " Nome do livro: " + nomeLivro + " Quantidades de paginas: " + qntDePaginas);
    }
}
