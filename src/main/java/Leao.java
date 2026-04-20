public class Leao extends AnimalAB{
    @Override
    public void comer() {
        super.qtdComida += 300;
    }

    @Override
    public void dormir() {
        super.qtdDormir += 17;
    }

    @Override
    public void mover() {
        super.qtdMover += 50;
    }

    public Leao(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
    }
}
