public class Cachorro extends AnimalTerrestreAB {

    @Override
    public void comer() {
        super.qtdComida += 50;
    }

    @Override
    public void dormir() {
        super.qtdDormir += 13;
    }

    @Override
    public void mover() {
        super.qtdMover += 10;
    }

    public Cachorro(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdPatas) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso, qtdPatas);
    }
}
