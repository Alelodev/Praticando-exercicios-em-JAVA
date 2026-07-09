public class main3 {
    static void main() {
        ModeloCarro kicksA = new ModeloCarro();
        kicksA.setNome("Nissan Kicks");
        kicksA.setModelo("Advanced");
        kicksA.setPreco(175.990);
        kicksA.setAno(2026);
        kicksA.setQuatroPortas(false);
        kicksA.setBancoDeCouro(false);
        kicksA.setCentralMultiMidia(true);

        kicksA.exibirDetalhesCarro();

        ModeloCarro kicksE = new ModeloCarro();
        kicksE.setNome("Nissan Kicks");
        kicksE.setModelo("Exclusive");
        kicksE.setPreco(177.990);
        kicksE.setAno(2026);
        kicksE.setCentralMultiMidia(true);
        kicksE.setBancoDeCouro(false);
        kicksE.setQuatroPortas(true);

        kicksE.exibirDetalhesCarro();

        ModeloCarro kicksP = new ModeloCarro();
        kicksP.setNome("Nissan Kicks");
        kicksP.setModelo("Platinum");
        kicksP.setPreco(199.000);
        kicksP.setAno(2026);
        kicksP.setQuatroPortas(true);
        kicksP.setBancoDeCouro(true);
        kicksP.setQuatroPortas(true);

        kicksP.exibirDetalhesCarro();

        Gato gato = new Gato();
        gato.setTipoAnimal("GATO");
        gato.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.setTipoAnimal("CACHORRO");
        cachorro.emitirSom();

        Animal animalAleatorio = new Animal();
        animalAleatorio.setTipoAnimal("ANIMALALEATORIO");
        animalAleatorio.emitirSom();

        ContaCorrente Alelo = new ContaCorrente();
        Alelo.setTarifaMensal(500);
        Alelo.setSaldo(15000);
        Alelo.setNumeroDaConta(123);
        Alelo.setTitular("Angelo");
        Alelo.exibirDetalhesConta();
        Alelo.cobrarTarifaMensal();
        Alelo.exibirDetalhesConta();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println(gerador.gerarProximoPrimo(17));

        gerador.listarPrimos(50);
    }
}
