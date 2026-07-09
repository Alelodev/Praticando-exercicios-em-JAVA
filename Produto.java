public class Produto {
    private String nome;
    private double preco;
    private int qnt;
    private double desconto;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void produtoComDesconto(){
        if(getQnt() > 3){
            double novoPreco = getPreco() * (1 - getDesconto());
            System.out.printf("Voce ganhou um desconto de 5%%, antigo valor do produto: %s, novo valor do produto: %s%n",
                    getPreco(), novoPreco);
        }
    }



}
