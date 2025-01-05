import java.util.*;

public class Merge_Sort {
    public static void merge(int a[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=a[start+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=a[mid+1+i];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int a[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergesort(a,start,mid);
            mergesort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergesort(a, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
        
    }
    
}
