public abstract class AnimalTerrestreAB extends AnimalAB{
    protected int qtdPatas;

    public AnimalTerrestreAB(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
        this.qtdPatas = qtdPatas;
    }
}
