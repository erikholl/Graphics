// Nazif

package be.intecbrussel.animal;

public abstract class Animal {
    // variables
    private String name;

    // constructors
    public Animal() {
        this("no name was given");
    }

    public Animal(String name) {
        setName(name);
    }

    // methods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // abstract methods
    public abstract void move();

    public abstract void makeNoise();
}

