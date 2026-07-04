package Recursion;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(Fibo(15));
    }
    public static int Fibo(int num){
        if(num<2){
            return num;
        }
        return Fibo(num-1) + Fibo(num-2);
    }
}
