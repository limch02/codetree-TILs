import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push": stack.push(Integer.parseInt(st.nextToken())); break;
                case "size": bw.write(stack.size()+"\n"); break;
                case "empty": if (stack.isEmpty()){
                    bw.write("1\n");
                }else {
                    bw.write("0\n");
                }break;
                case "pop": bw.write(stack.pop()+"\n"); break;
                case "top": bw.write(stack.peek()+"\n"); break;
            }
        }
        bw.close();
    }
}