package Assignment1;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    float  m1, m2, m3 , average;
    int age;
    String name;
    public Student(int a , String b){
        age = a;
        name = b;
    }
    public void setMarks(){
        System.out.print("enter marks : ");
        m1 = sc.nextFloat();
        System.out.print("enter marks : ");
        m2 = sc.nextFloat();
        System.out.print("enter marks : ");
        m3 = sc.nextFloat();
    }
    public void avg(){
        average =  (m1+m2+m3)/3;
        System.out.println("the average = "+average);
    }
    public void max(){
       if(m1 > m2 && m1 > m3){System.out.println("the maximum marks "+m1);}
       if(m2 > m1 && m2 > m3){System.out.println("the maximum marks "+m2);}
       if(m3 > m2 && m3 > m1){System.out.println("the maximum marks "+m3);}
    }
    public void info(){
        System.out.println("all information of student : ");
        System.out.printf("the %s of %d years\n",name,age);
        System.out.println("marks are = "+m1+", "+m2+", "+m3);
        avg();
        max();
    }
    public static void main(String[] args) {
        Student st  = new Student(10,"xyz");
        st.setMarks();
        st.avg();
        st.max();
        st.info();
    }
}
