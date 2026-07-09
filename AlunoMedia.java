public class AlunoMedia {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double qntNotas;
    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getQntNotas() {
        return qntNotas;
    }

    public void setQntNotas(double qntNotas) {
        this.qntNotas = qntNotas;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void mediaDeNotas(){
        System.out.printf("Sua media é: %s %n", media);
    }
}
