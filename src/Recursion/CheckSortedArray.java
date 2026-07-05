package Recursion;
import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of Elements : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the Elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Sorted(arr,0));

    }
    public static boolean Sorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        return(arr[idx] < arr[idx+1] && Sorted(arr,idx+1));
    }
}
