package Assignment01;

import java.util.Scanner;

public class Task7 {
    public void pattern(int n){
        System.out.println("pattern");
        for(int i = 1 ; i <= n ; i ++){
            for (int j = 1 ; j <= i ; j++){
                System.out.printf("%d ",j);
            }
            System.out.printf("\n");
        }
    }
    public void alphabetsAndUnicode(){
        int startUnicode = 65;
        System.out.println("alphabets and their unicodes wala program");
        for(int i = startUnicode ; i<= 90 ; i++){
            System.out.printf("%d is the unicode of %c\n",i ,(char)i);
            // (char) --> typeCasting
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n : ");
        int n = sc .nextInt();
        Task7 t = new Task7();
        t.pattern(n);
        t.alphabetsAndUnicode();
        sc.close();
    }
}
