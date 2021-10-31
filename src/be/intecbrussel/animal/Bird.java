package be.intecbrussel.animal;

public class Bird {

    public Bird (){this("Eagle");}
    public Bird ( String name){
//        super(name);
    }



    @Override
    public void move (){
        System.out.println("fast");
    }
    @Override
    public void makeNoise (){
        System.out.println("Bird noise");
    }




}
}
