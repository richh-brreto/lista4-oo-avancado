public class Elefante extends AnimalAB{
    @Override
    public void comer() {
        super.qtdComida += 150;
    }

    @Override
    public void dormir() {
        super.qtdDormir += 2;
    }

    @Override
    public void mover() {
        super.qtdMover += 30;
    }

    public Elefante(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
    }
}
