public abstract class AnimalMarinhoAB extends AnimalAB {
    protected int qtdNadar;

    public AnimalMarinhoAB(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdNadar) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso);
        this.qtdNadar = qtdNadar;
    }

    public abstract void nadar();
}
