public class main2 {
    static void main() {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(123);
        conta.setSaldo(1000);
        conta.titular = "Angelo";

        System.out.println("Numero da conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo saldo: " + conta.getSaldo());

        IdadePessoa velho1 = new IdadePessoa();

        velho1.setNome("Angelo Roberto Da Silva Medeiros ");
        velho1.setIdade(22);

        System.out.println(velho1.getNome() + "tem" + velho1.getIdade() + "anos");
        velho1.maiorIdade();

        Produto produto1 = new Produto();

        produto1.setNome("Arroz seu jorge");
        produto1.setPreco(23.50);
        produto1.setQnt(5);
        produto1.setDesconto(0.05);

        produto1.produtoComDesconto();

        AlunoMedia Angelo = new AlunoMedia();
        Angelo.setNome("Angelo Roberto Da Silva Medeiros");
        Angelo.setNota1(5.4);
        Angelo.setNota2(9.3);
        Angelo.setNota3(8);
        Angelo.setQntNotas(3);

        Angelo.setMedia((Angelo.getNota1() + Angelo.getNota2() + Angelo.getNota3()) / Angelo.getQntNotas());
        Angelo.mediaDeNotas();

        Livro primeiroLivro = new Livro();

        primeiroLivro.setNomeLivro("Harry Potter e a pedra filosofal");
        primeiroLivro.setAutorDoLivro("J. K. Rowling");
        primeiroLivro.setQntDePaginas(368);
        primeiroLivro.detalhesLivro();
    }
}
