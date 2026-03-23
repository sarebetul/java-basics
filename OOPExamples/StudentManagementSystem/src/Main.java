class Student {
    String name;
    int age;
    double grade;

    public Student(String a, int i, double v) {
        name = a;
        age = i;
        grade = v;
    }

    void bilgiYazdir(){

        System.out.println("Name: " + name + " Age: " + age + " Note: " + grade);
    }
    String gectiMi(){
        if(grade < 50) return "Kaldı";
        else return "Geçti";
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 20, 75.5 );
        s1.bilgiYazdir();
        System.out.println( s1.gectiMi());
        Student s2 = new Student("Ayşe" , 19, 45.0);
        s2.bilgiYazdir();
        System.out.println(s2.gectiMi());
    }
}
