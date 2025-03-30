import java.util.Scanner;

class Person{
    String name;
    int age;

    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int studentID;
    String grade;
    public Student(String name , int age) {
        super(name, age);
    }
    public void setInfo(Scanner sc){
        System.out.print("enter the Student ID :");
        studentID = sc.nextInt();
        System.out.print("enter the Grade : ");
        grade = sc.next();
    }
    public void getInfo(){
        System.out.printf("%s\t%d\t%d\t%s\n",name,studentID,age,grade);
    }
    
}
public class Task1{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
        Student s1 = new Student("Hiten", 20);
        s1.setInfo(sc);
        Student s2 = new Student("Karan", 20);      
        s2.setInfo(sc);
        System.out.println("Student Details");
        System.out.printf("Name\tID\tAge\tGrade\n");
        s1.getInfo();
        s2.getInfo();
        sc.close();
        }
    }
}