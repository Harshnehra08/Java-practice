package OOPs;

class Student3{

    Student3(){

        System.out.println("Default");
    }

    Student3(int id){

        System.out.println(id);
    }

    Student3(int id,String name){

        System.out.println(id+" "+name);
    }
}

public class Constructor_Overloading {

        public static void main(String[] args){

            new Student3();

            new Student3(100);

            new Student3(101,"Harsh");
        }
    }

