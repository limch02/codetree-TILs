import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(s.nextToken());
            if (b%2==0){
                arr.add(b);
            }
        }
        for (int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}