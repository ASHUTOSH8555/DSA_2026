package STACK;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int ele)
    {
        if(st.size()==0) {
            st.push(ele);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st)
    {
        if(st.size()==1) return;
        else {
            int top=st.pop();
            reverse(st);
            pushAtBottom(st,top);
        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }

}
