public class Musica {
    String titulo;
    String Cantor;
    int tempoEmSegundos;
    int anoDeLancamento;

    void exibeFichaTecnica(){
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Cantor: " + Cantor);
        System.out.println("Duracao: " + tempoEmSegundos);
        System.out.println("Lancamento: " + anoDeLancamento);
    }
}
