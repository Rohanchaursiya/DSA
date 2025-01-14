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
        String s=sc.el();
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

// echo "# DSA" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/Rohanchaursiya/DSA.git
// git push -u origin main



    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

            Map<Integer, int[]> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!hm.containsKey(a[i])) {
                    hm.put(a[i], new int[]{i, i});
                } else {
                    hm.get(a[i])[1] = i;
                }
            }

            List<int[]> li = new ArrayList<>();
            for (Map.Entry<Integer, int[]> entry : hm.entrySet()) {
                int[] range = entry.getValue();
                if (range[0] != range[1]) {
                    li.add(range);
                }
            }

            if (li.isEmpty()) {
                System.out.println(0);
                return;
            }

            li.sort(Comparator.comparingInt(a1 -> a1[0]));
            List<int[]> merged_li = new ArrayList<>();
            int[] curr = li.get(0);

            for (int i = 1; i < li.size(); i++) {
                int[] el = li.get(i);
                if (el[0] <= curr[1]) {
                    curr[1] = Math.max(curr[1], el[1]);
                } else {
                    merged_li.add(curr);
                    curr = el;
                }
            }
            merged_li.add(curr);

            int ans = 0;
            for (int[] inter_val : merged_li) {
                Set<Integer> set = new HashSet<>();
                for (int i = inter_val[0]; i <= inter_val[1]; i++) {
                set.add(a[i]);
        }
        ans += set.size();
    }
    System.out.println(ans);