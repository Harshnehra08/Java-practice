package OOPs;

import java.util.concurrent.Callable;

interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    }
}

public class Abstraction_Interface_Class {
    public static void main(String[] args){
      C c = new C();
      c.show();
      c.display();
    }
}
