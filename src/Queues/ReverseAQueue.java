package Queues;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args)
    {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);
        Stack<Integer> st=new Stack<>();
        while(q1.size()>0){
            st.push(q1.remove());
        }
        while(st.size()>0){
            q1.add(st.pop());
        }
        System.out.println(q1);
    }
}
