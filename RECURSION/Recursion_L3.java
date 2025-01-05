import java.util.*;
public class Recursion_L3 {
    /*Reverse the array using Recursion */
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] reverse(int a[],int i,int j){
        if(i<j){
            // int temp=a[i];
            // a[i]=a[j];
            // a[j]=temp;
            swap(a,i,j);
            reverse(a,i+1,j-1);
        }
        return a;
    }
    public static void reverse(int a[],int i){
        int n=a.length;
        if(i<n/2){
            swap(a,i,n-i-1);
            reverse(a,i+1);
        }
        //return a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans[]=reverse(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        reverse(a, 0);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }    
}
