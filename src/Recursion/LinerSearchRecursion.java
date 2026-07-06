package Recursion;

public class LinerSearchRecursion {
    public static void main(String[] args){
        int[] arr = {1,23,42,4,45,12,54};
        int target = 45;
        System.out.println(Search(arr, target,0));
    }
    public static int Search(int[] arr, int target, int i)
    {
        if(i==arr.length) return -1;

        if(arr[i]!=target){
            return Search(arr, target, i+1);
        }
        return i;
    }
}
