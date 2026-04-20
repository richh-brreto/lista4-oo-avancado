public class Pombo extends AnimalVoadorAB{
    public Pombo(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdVoar, int qtdAsas, int envergaduraAsas) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso, qtdVoar, qtdAsas, envergaduraAsas);
    }

    @Override
    public void comer() {
        super.qtdComida = 5;
    }

    @Override
    public void dormir() {
        super.qtdDormir = 12;
    }

    @Override
    public void mover() {
        super.qtdDormir = 3;
    }

    @Override
    public void voar() {
        super.qtdVoar = 30;
        super.qtdAsas = 2;
        super.envergaduraAsas = 2;
    }
}
