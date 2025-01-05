import java.util.*;
public class Graph_Representation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int adj[][]=new int[n+1][m+1];
        int u,v;
        for(int i=0;i<n;i++){
            u=sc.nextInt();
            v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}