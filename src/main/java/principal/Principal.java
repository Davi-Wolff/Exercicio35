package principal;

import model.Animal;
import model.Ave;
import model.Cachorro;

/**
 *
 * @author Davi Wolff
 */
public class Principal {

    public static void main(String[] args) {
        
        Animal dog = new Cachorro();
        Animal bird = new Ave();
        
        dog.produzirSom();
        bird.produzirSom();
        dog.mover();
        bird.mover();
        
    }
}
