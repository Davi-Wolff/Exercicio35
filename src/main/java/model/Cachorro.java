package model;

/**
 *
 * @author Davi Wolff
 */
public class Cachorro implements Animal {

    public Cachorro() {
    }

    @Override
    public void produzirSom() {
        System.out.println("Latir");
    }

    @Override
    public void mover() {
        System.out.println("Andar");
    }

}
