package OOPs;

class Math{
    int add(int a, int b){
        System.out.println(a+b);
        return a+b;

    }
    int add(int a, int b, int c){
        System.out.println(a+b+c);
        return  a+b+c;
    }
}

public class Polymorphism_Method_Overloading {
    public static void main(String[] args){
        Math m = new Math();
        m.add(1,3);
        m.add(2,4);
        m.add(2,3,4);

    }
}
