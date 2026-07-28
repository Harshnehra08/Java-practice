package OOPs;

abstract class Animal2{
    abstract void sounds();

    void sleep(){
        System.out.println("Sleeping");
    }
}
class Cat extends Animal2 {
    void sounds() {
        System.out.println("Cat Meow");
    }
}

public class Abstraction_Abstract_class {
    public static void main(String[] args){
        Animal2 c = new Cat();
        Cat a = new Cat();
        c.sounds();
        c.sleep();
        a.sleep();
        a.sounds();
    }
}
