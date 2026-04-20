public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro(0, 0, 0, "Rex", "Canino", 5, "Doméstico", 0.60, 25.0, 4);

        Peixe fish = new Peixe(0, 0, 0, "Nemo", "Peixe-Palhaço", 2, "Oceano", 0.10, 0.5, 0);

        Pombo bird = new Pombo(0, 0, 0, "Poli", "Ave", 1, "Urbano", 0.25, 0.4, 0, 2, 1);

        Gato cat = new Gato(0, 0, 0, "Mingau", "Felino", 3, "Casa", 0.25, 4.5);

        Elefante elephant = new Elefante(0, 0, 0, "Dumbo", "Mamífero", 10, "Savana", 3.20, 5000.0);

        Leao lion = new Leao(0, 0, 0, "Simba", "Felino", 7, "Savana", 1.20, 190.0);

        dog.comer();
        dog.mover();
        dog.dormir();

        fish.comer();
        fish.nadar();
        fish.dormir();

        bird.comer();
        bird.voar();
        bird.dormir();

        cat.comer();
        cat.mover();
        cat.dormir();

        elephant.comer();
        elephant.mover();
        elephant.dormir();

        lion.comer();
        lion.mover();
        lion.dormir();
    }
}