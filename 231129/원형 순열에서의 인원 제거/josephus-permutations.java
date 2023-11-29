import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int [] arr =new int[n];
        for (int i =1;i<=n;i++){
            queue.add(i);
        }
        int i =1;
        int j=0;
        while (!queue.isEmpty()){
            if (i%k==0){
                arr[j]= queue.peek();
                queue.poll();
                i++;
                j++;
            }else {
                queue.add(queue.peek());
                queue.poll();
                i++;
            }
        }

        for (int h = 0;h<n;h++){
            if (h==n-1){
                bw.write(arr[h]+"");
            }
            else {
                bw.write(arr[h] + " ");
            }
        }
        bw.close();
    }
}