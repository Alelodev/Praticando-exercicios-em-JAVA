public class  Principal{
    static void main() {

        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Face Do Desespero";
        minhaMusica.tempoEmSegundos = 353;
        minhaMusica.anoDeLancamento = 2025;
        minhaMusica.Cantor = "Enygma";

        minhaMusica.exibeFichaTecnica();

        Carro carro1 = new Carro();

        carro1.ano = 2025;
        carro1.modelo = "HRV";
        carro1.completo = true;

        carro1.fichaCarro();

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Angelo Roberto Da Silva Medeiros";
        aluno1.idade = 22;
        aluno1.dataDeNascimento = "02/01/2004";

        aluno1.fichaAluno();
    }
}