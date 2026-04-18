package STACK;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node temp=new Node(ele);
        temp.next=head;
        head=temp;
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfStack {
    public static void main(String[] args)
    {
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
