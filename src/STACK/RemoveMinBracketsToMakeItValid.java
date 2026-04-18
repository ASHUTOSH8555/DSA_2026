package STACK;

import java.util.Stack;
import java.util.Scanner;

public class RemoveMinBracketsToMakeItValid {
    public static int isValid(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);

        if(ch=='('){
            st.push(ch);
        }
        else {
            if (st.size()==0) st.push(ch);
            else if (st.peek() == '(') st.pop();
            else st.push(ch);
           }
        }
        return st.size();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
