package OOPs;

class Student{
    int id;
    String name;

    void display(){
        System.out.print(name+ " , ");
        System.out.println(id);
    }

}
public class Creating_Class_Object {
    public static void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 101;
        s1.name = "Harsh Nehra";
        s2.id = 102;
        s2.name = "Akash Choudhary";
        s1.display();
        s2.display();
    }
}
