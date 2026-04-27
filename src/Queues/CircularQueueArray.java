package Queues;

public class CircularQueueArray {
    public static class Cqa{
        int front =-1;
        int rear =-1;
        int size=0;
        int[] arr=new int[5];
        public void add(int val) throws Exception
        {
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int Remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1){
                    front=0;
                }
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else{
                return arr[front];
            }
        }
        public boolean inEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            else if(front<=rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front; i<arr.length; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear; i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception
    {
        Cqa c1=new Cqa();
        c1.display();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.display();
        c1.Remove();
        c1.display();

    }
}
