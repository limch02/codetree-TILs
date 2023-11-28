import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        for (int i=0;i<a;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            switch (s.nextToken()){
                case "push": q.addFirst(Integer.parseInt(s.nextToken())); break;
                case "pop": if (q.size()>=1){
                    bw.write(q.pollLast()+"\n");
                }else {
                    bw.write(String.valueOf(-1)+"\n");
                }break;
                case "size": bw.write(String.valueOf(q.size())+"\n"); break;
                case "empty":if (q.isEmpty()){
                    bw.write(String.valueOf(1)+"\n");
                }else {
                    bw.write(String.valueOf(0)+"\n");
                }
                break;
                case "front": if (q.size()>=1){
                    bw.write(q.peekLast()+"\n");
                }else {
                    bw.write(String.valueOf(-1)+"\n");
                }
                break;
                case "back": if (q.size()>0){
                    bw.write(String.valueOf(q.peekFirst())+"\n");
                }else {
                    bw.write(String.valueOf(-1)+"\n");
                }
                break;
            }
        }
        bw.close();
    }
}