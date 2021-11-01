// Jan, Emrah

package be.intecbrussel.animal;

public class Bird extends Animal {
    // constructors
    public Bird () {
        this("Eagle");
    }
    public Bird ( String name) {
        super.setName(name);
    }

    // methods
    @Override
    public void move (){
        System.out.println("fast");
    }

    @Override
    public void makeNoise (){
        System.out.println("Bird noise");
    }

}
