import java.util.*;
public class Recursion_L1 {

    //Print Numer 1 to N 
    public static void Print(int i,int n){
        if(i>n)return ;
        System.out.println(i);
        Print(i+1,n);
    }
    //print Number N to 1 
    public static void RevPrint(int n){
        if(n==0)return ;
        System.out.println(n);
        RevPrint(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int i=1;
        RevPrint(n);
    }
    
}
