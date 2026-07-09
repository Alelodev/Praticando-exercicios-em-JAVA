public class Animal {
    private String tipoAnimal;

    public void emitirSom(){
        System.out.println("Som generico de animal");
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
