import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        for (int i =0;i<=a;i++){
            set.add(i); //수열 생성
        }
        StringTokenizer s = new StringTokenizer(br.readLine()); //제거할 수
        for (int i =0;i<b;i++){
            set.remove(Integer.parseInt(s.nextToken()));
            Iterator<Integer> it = set.iterator();
            int len = 1;
            int max = Integer.MIN_VALUE;
            int [] arr = new int[set.size()];
            int j =0;
            while (it.hasNext()){
                arr[j] = it.next();
                j++;
            }
            for (int k =0;k<arr.length-1;k++){
                if (arr[k]+1==arr[k+1]) {
                    len++;
                } else{
                    len =1;
                }
                if (max<len){
                    max = len;
                }

            }
            System.out.println(max);
        }
    }
}