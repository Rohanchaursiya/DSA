import java.util.*;
public class Selection_Sort {
    public static void SelectionSort(int n,int arr[]){
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SelectionSort(n,a);
        for(int i : a){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
