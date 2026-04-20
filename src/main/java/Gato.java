public class Gato extends AnimalAB{
    @Override
    public void comer() {
        super.qtdComida += 35;
    }

    @Override
    public void dormir() {
        super.qtdDormir += 12;
    }

    @Override
    public void mover() {
        super.qtdMover += 7;
    }

    public Gato(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
    }
}
