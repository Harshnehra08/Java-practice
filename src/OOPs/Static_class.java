package OOPs;
class Student0 {
    String name;
    static String school;
        }

public class Static_class {
    public static void main(String[] args) {
        Student0.school = "BBPS";
        Student0 stu1 = new Student0();
        stu1.name = "Harsh";
        System.out.println(stu1.name);
        System.out.println(stu1.school);
    }
}
