public class Carro {
    String modelo;
    int ano;
    Boolean completo;

    void fichaCarro(){
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Ano: " + ano);
        if (completo == true){
            System.out.printf("Versao Completa! %n");
        } else {
            System.out.printf("Versao Incompleta %n");
        }
    }
}
