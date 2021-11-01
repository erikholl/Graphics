// Marouane, Mustafa, Erik

package be.intecbrussel.animal;

public class Snake extends Animal  {
    // constructors
    public Snake() {
        this("Joe");
    }

    public Snake(String name) {
        super.setName(name);
    }

    // methods
    @Override
    public void move() {
        System.out.println("snakemove");
    }

    @Override
    public void makeNoise() {
        System.out.println("ssssssssshhhhhh");
    }
}
