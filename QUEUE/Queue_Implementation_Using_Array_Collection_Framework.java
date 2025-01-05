import java.util.*;
public class Queue_Implementation_Using_Array_Collection_Framework {
    public static void main(String[] args){
        //By Using LinkedList
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
        //By Using ArryDeque
        Queue<Integer> Q=new ArrayDeque<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        while(!Q.isEmpty()) {
            System.out.println(Q.remove());
        }
    }
}
