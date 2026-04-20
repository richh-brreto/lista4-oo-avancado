public class Peixe extends AnimalMarinhoAB{
    public Peixe(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso, int qtdNadar) {
        super(qtdComida, qtdMover, qtdDormir, nome, tipo, idade, habitat, altura, peso, qtdNadar);
    }

    @Override
    public void comer() {
        super.qtdComida = 3;
    }

    @Override
    public void dormir() {
        super.qtdDormir = 7;
    }

    @Override
    public void mover() {
        super.qtdDormir = 3;
    }

    public void nadar(){
        super.qtdNadar = 15;
    }
}
