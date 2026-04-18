package STACK;

import java.util.Stack;
import java.util.Scanner;

public class RemoveConsecutiveSubsequence {
    public static Stack<Integer> RemoveSubsequence(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length; i++) {
            int x = arr[i];

            if (st.size() == 0) st.push(x);
            else {
                if (st.peek() == x) st.pop();
                else st.push(x);
            }
        }
        return st;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elemnts: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(RemoveSubsequence(arr));
    }
}
