package Recursion;

public class PrintNums {
    public static void main(String[] args){
        Fun(5);
    }
//    public static void Fun(int n){
//        if(n==0) return ;
//        System.out.println(n);
//        Fun(n-1);
//    }
    public static void Fun(int n){
        if(n==0) return;
        System.out.println(n);
        Fun(n-1);
        System.out.println(n);
    }
}
