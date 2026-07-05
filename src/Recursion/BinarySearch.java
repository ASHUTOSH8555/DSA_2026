package Recursion;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {1,2,34,5,3,42,53,67};
        int target =  42;
        System.out.println(Search(arr, target, 0, arr.length-1));
    }
    public static int Search(int[] arr, int target, int st, int end){
        if(st>end) return -1;
        int mid= st+(end-st)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            return Search(arr, target, st, mid-1);
        }
        return Search(arr, target, mid+1, end);
    }
}
