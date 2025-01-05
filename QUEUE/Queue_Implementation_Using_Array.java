
public class Queue_Implementation_Using_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            this.size=n;
             arr=new int[size];
            rear=-1;

        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static boolean isFull() {
           return rear==size-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("OverFlow");
                return;
            }
            arr[++rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
            q.peek();
        }
        

    }
    
}
