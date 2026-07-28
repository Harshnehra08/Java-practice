package OOPs;

class Animals {
    void eat(){
        System.out.println("Eating");
    }
}
class Dogs extends Animals{
    void Barks(){
        System.out.println("Barking");
    }
}
class Puppy extends Dogs{
    void Weep(){
        System.out.println("Weeping");
    }
}
public class Inheritance_Oops {
    public static void main(String[] args){
        Dogs d = new Dogs();
        d.eat();
        d.Barks();
        Puppy p = new Puppy();
        p.eat();
        p.Barks();
        p.Weep();
    }
}
