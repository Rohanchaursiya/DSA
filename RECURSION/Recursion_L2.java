import java.util.*;
public class Recursion_L2 {
    //Parameterised version of Recursion
    public static void SumOfFirst_N_Number(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        SumOfFirst_N_Number(n-1,sum+n);

    }
    public static void Factorial(int n,int prod){
        if(n<=1){
            System.out.println(prod);
            return ;
        }
        Factorial(n-1,prod*n);
    }
    
    //Functional version of Recursion
    public static int SumOfFirst_N_Number(int n){
        if(n<1)return 0;
        return n+SumOfFirst_N_Number(n-1);
    }
    public static int Factorial(int n){
        if(n<1)return 1;
        return n*Factorial(n-1);
    }
    public static int f(int n)
{
	if(n==0)
	{
		return 0;
	}
	else if(n<=2)
	{
		return 1;
	}
	else
	{
		return f(n-1)+f(n-2)+f(n-3);
	}
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumOfFirst_N_Number(n,0);
        int ans=SumOfFirst_N_Number(n);
        System.out.println(ans);
        Factorial(n,1);
        int ans1=Factorial(n);
        System.out.println(ans1);
        int s=f(7);
        System.out.println(s);



    }

    
}
