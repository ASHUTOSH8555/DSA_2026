package STACK;

import java.util.*;

class MinStack {
    Stack<Long> st = new Stack<>();
    long min;

    public MinStack() {

    }

    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min = val;
        }
        else{
            long diff = (long)val - min;
            st.push(diff);

            if(diff < 0){
                min = val;
            }
        }
    }

    public void pop() {
        if(st.isEmpty()) return;

        long diff = st.pop();

        if(diff < 0){
            min = min - diff;
        }
    }

    public int top() {
        long diff = st.peek();

        if(diff >= 0){
            return (int)(min + diff);
        } else {
            return (int)min;
        }
    }

    public int getMin() {
        return (int)min;
    }
}

public class MInStackWithoutExtraStack {
    public static void main(String[] args) {
        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin());

        obj.pop();

        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}