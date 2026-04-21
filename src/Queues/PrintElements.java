package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PrintElements {
    public static void main(String[] args)
    {
        Queue<Integer> Queue1=new LinkedList<>();
        Queue1.add(1);
        Queue1.add(2);
        Queue1.add(3);
        Queue1.add(4);
        Queue1.add(5);
        Queue<Integer> Queue2=new LinkedList<>();
        while(Queue1.size()>0) {
            int top = Queue1.peek();
            System.out.print(top+" ");
            Queue2.add(Queue1.remove());
        }
        while(Queue2.size()>0){
            Queue1.add(Queue2.poll());
        }
    }
}
