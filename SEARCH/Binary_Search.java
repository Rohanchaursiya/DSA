import java.util.*;
public class Binary_Search {
    public static int BinarySearch(int a[],int key){
        int start=0;
        int end=a.length-1;
        int idx=-1; 
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                idx=mid;
                break;
            }else if(a[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return idx;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=BinarySearch(a, key);
        System.out.println(index!=-1 ? "Key is found at index "+index : "Key is not found");
        sc.close();
    }
    
}
