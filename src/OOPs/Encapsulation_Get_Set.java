package OOPs;

class Stu {

    private int age;

    public void setAge(int age){

        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }

    public int getAge(){
        return age;
    }
}

public class Encapsulation_Get_Set {

    public static void main(String[] args) {

        Stu s = new Stu();

        s.setAge(20);

        System.out.println(s.getAge());

        s.setAge(-5);
    }
}
