public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void maiorIdade(){
        if(getIdade() >= 18){
            System.out.printf("Maior de idade ");
        } else {
            System.out.printf("Menor de idade ");
        }
    }
}
