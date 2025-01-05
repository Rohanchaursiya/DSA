import java.util.Scanner;
public class Quick_Sort {
    public static int partition(int a[],int start,int end){
        int pivot=a[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[end];
        a[end]=temp;
        return i+1;
    }
    public static void quicksort(int a[],int start,int end){
        if(start<end){
            int pi=partition(a, start, end);
            quicksort(a, start, pi-1);
            quicksort(a, pi+1, end);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quicksort(a, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();

    }
}
