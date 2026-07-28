package OOPs;

//class Student2{
//
//    Student2(){
//
//        System.out.println("Constructor Called");
//    }
//}
//
//public class Default_Constructor {
//
//        public static void main(String[] args){
//
//            Student2 s = new Student2();
//        }
//    }

class Student2{

    int id;
    String name;

    Student2(int i,String n){

        id=i;
        name=n;
       // System.out.println(id+" "+name);
    }

    void display(){

        System.out.println(id+" "+name);
    }
}

public class Default_Constructor{

    public static void main(String[] args){

        Student2 s=new Student2(101,"Harsh");

        s.display();
    }
}
