import java.util.*;
public class Linear_Search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                idx=i;
            }
        }
        System.out.println("Key is found at index "+idx);
        sc.close();
    }
}
