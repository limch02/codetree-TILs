import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i =1;i<=n;i++){
            queue.add(i);
        }
        while (!queue.isEmpty()){
            if (queue.size()==1){
                bw.write(queue.poll()+"");
            }else {
                queue.poll();
                queue.add(queue.peek());
                queue.poll();
            }
        }
        bw.close();
    }
}