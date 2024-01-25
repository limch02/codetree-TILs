import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        for (int i =2;i<10;i++){
            arr.add(arr.get(i-1)+(arr.get(i-2)*2));
        }
        for (int i =0 ;i<10;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}