package Recursion;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,2,3,6,7,89,76};
        Sort(arr);
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
    }
    public static void Sort(int[] arr){

        if(arr.length <= 1) return;

        int n= arr.length;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        int idx=0;
        for(int i=0; i<a.length; i++){
            a[i]=arr[idx++];
        }
        for(int i=0; i<b.length; i++){
            b[i]=arr[idx++];
        }
        Sort(a);
        Sort(b);
        Merge(a,b,arr);
    }
    public static void Merge(int[] a, int[] b, int[] c){
        int i=0; int j=0;
        int k=0;
        while(i < a.length && j < b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
}
