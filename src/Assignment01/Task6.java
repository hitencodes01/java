package Assignment01;

public class Task6 {
    // a^1 + a^2 + a^3 ---- a^n
    public double series(double x , double n){
        double i = 1;
        double result = 0;
        while(i<=n){
            result = result + Math.pow(x, i);
            i = i + 1;
        }
        return result;
    }
    // 0,7,27,63,----p
    public void series(int p){
        for(int i = 1 ; i <= p ; i++){
            double newI = i;
            System.out.println((int)Math.pow(newI, 3.0) - 1);
        }
    }
    // 1/2 + 1/2 + ----- 1/10
    public double  series(){
        double res = 0 ;
        for(int i = 2 ; i <=10 ; i++){
            res = res + (1.0/i); 
        }
        return res;
    }
    public static void main(String[] args) {
        Task6 t = new Task6();
        System.out.println(""+(int)t.series(1, 3));
        System.out.println("answer of second series");
        t.series(5);
        System.out.println("sum of series = "+t.series());
    }
}
