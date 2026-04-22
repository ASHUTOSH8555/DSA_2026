package Queues;

public class ArrayImplemenatationOfQueue {
    static class queue1{
        int f = -1;
        int r = -1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val){
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                f++;
                size--;
                return arr[f-1];
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
            }
            else{
                for(int i=f; i<=r; i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        queue1 q1=new queue1();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
    }

}
