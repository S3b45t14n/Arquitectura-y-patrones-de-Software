package Ejemplo_principio5_D;

/**
 *
 * @author Sebastian
 */
public abstract class Animal implements IAnimal {
    
    public String nombre="";

    @Override
    public void comunicarse() {
        System.out.println("El animal se comunica");
    }
    
    public abstract void animal();
    public abstract void tipoAnimal();
    public abstract void getNombre();
    
}
