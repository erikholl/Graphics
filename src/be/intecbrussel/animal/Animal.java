package be.intecbrussel.animal;

public abstract class Animal {
    private String name;

    public Animal() {
        this("no name was given");
    }

    public Animal(String name) {
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void move(){
        move();
    }
    public void makeNoise(){
        makeNoise();
    }
}

