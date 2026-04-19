package STACK;

import java.util.Scanner;
import java.util.Stack;

public class HistogramArea {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();

        int[] heights=new int[n];
        for(int i=0; i<n; i++){
            heights[i]=sc.nextInt();
        }
        int result = LargestRectangleArea(heights);
        System.out.println("Maximum Area is : " + result);
    }
    public static int LargestRectangleArea(int[] heights)
    {
        int n=heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse=new int[n];
        int[] pse=new int[n];

        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2; i>=0; i--){
            while(st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.isEmpty()) st.pop();

        st.push(0);
        pse[0]=-1;
        for(int i=1; i<=n-1; i++){
            while(st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int max =-1;
        for(int i=0; i<n; i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}
