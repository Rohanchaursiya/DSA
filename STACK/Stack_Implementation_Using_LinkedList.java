public class Stack_Implementation_Using_LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next=null;
        }
    }
    public static class Stack{
        public static Node head;
        //It is used for check the stack is Empty or Not empty
        //If Stack is Empty then it returns true otherwise it returns false 
        static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
