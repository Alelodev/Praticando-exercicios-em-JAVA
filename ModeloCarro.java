public class ModeloCarro extends Carro2 {
    private boolean bancoDeCouro;
    private boolean centralMultiMidia;
    private boolean quatroPortas;

    public boolean isBancoDeCouro() {
        return bancoDeCouro;
    }

    public void setBancoDeCouro(boolean bancoDeCouro) {
        this.bancoDeCouro = bancoDeCouro;
    }

    public boolean isCentralMultiMidia() {
        return centralMultiMidia;
    }

    public void setCentralMultiMidia(boolean centralMultiMidia) {
        this.centralMultiMidia = centralMultiMidia;
    }

    public boolean isQuatroPortas() {
        return quatroPortas;
    }

    public void setQuatroPortas(boolean quatroPortas) {
        this.quatroPortas = quatroPortas;
    }

    public void exibirDetalhesCarro(){
        System.out.println(getNome());
        System.out.println(getModelo());
        System.out.println(getAno());
        System.out.println(getPreco());
        System.out.println(bancoDeCouro);
        System.out.println(centralMultiMidia);
        System.out.println(quatroPortas);
        System.out.printf("--------------------------------------------------------------%n");
    }
}
