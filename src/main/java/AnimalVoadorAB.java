public abstract class AnimalVoadorAB extends AnimalAB {
    protected int qtdVoar;
    protected int qtdAsas;
    protected int envergaduraAsas;

    public AnimalVoadorAB(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdVoar, int qtdAsas, int envergaduraAsas) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
        this.qtdVoar = qtdVoar;
        this.qtdAsas = qtdAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public AnimalVoadorAB() {
    }

    public abstract void voar();
}
