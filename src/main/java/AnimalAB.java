public abstract class AnimalAB implements AnimalIF {
    protected int qtdComida;
    protected int qtdMover;
    protected int qtdDormir;
    protected String nome;
    protected String tipo;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB(int qtdComida, int qtdMover, int qtdDormir, String nome, String tipo, int idade, String habitat, double altura, double peso) {
        this.qtdComida = qtdComida;
        this.qtdMover = qtdMover;
        this.qtdDormir = qtdDormir;
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    public AnimalAB(){
    }

    public abstract void comer();

    public abstract void dormir();

    public abstract void mover();
}
