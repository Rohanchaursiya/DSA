import java.util.*;
public class DP_Intro {
    //Introduction to Dynamic Programming
    //Dynamic Programming is a method for solving complex problems by breaking them down into simpler subproblems, solving each subproblem only once, and storing the solutions to avoid redundant work.

    public static long mod=(long)1e9+7;
    //Using Top-Down Approach (Memoization)
    public static long Top_Down(int n,long dp[]){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=(Top_Down(n-1, dp) + Top_Down(n-2, dp))%mod;
    }
    //Using Bottom-Up Approach
    public static long Bottom_Up(int n){
        long dp2[]=new long[n+1];
        dp2[0]=0;
        dp2[1]=1;
        for(int i=2;i<=n;i++)
            dp2[i]=(dp2[i-1]+dp2[i-2])%mod;
        return dp2[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Find N-th Fibonacci Number by using Top-Down and Bottom-Up
        //Top-Down or Memoization
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Bottom_Up(n));
        sc.close();
    }
    
}
