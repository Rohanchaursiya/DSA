import java.util.*;
public class Main{
    public static String Help(String s,int a[][]){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<a.length;i++){
            int si=a[i][0];
            int ei=a[i][1];
            int dir=a[i][2];
            for(int j=si;j<=ei;j++){
                int curr_pos=sb.charAt(j)-'a';
                int new_pos;
                if(dir==1){
                    new_pos=(curr_pos+1)%26;
                }else{
                    new_pos=(curr_pos-1+26)%26;
                }
                sb.setCharAt(j,(char)('a'+new_pos));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(Help(s, a));
    }
}

echo "# DSA" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Rohanchaursiya/DSA.git
git push -u origin main