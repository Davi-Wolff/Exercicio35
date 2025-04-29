package model;

/**
 *
 * @author Davi Wolff
 */
public class Ave implements Animal {

    public Ave() {
    }

    @Override
    public void produzirSom() {
        System.out.println("Cantar");
    }

    @Override
    public void mover() {
        System.out.println("Voar");
    }

}
