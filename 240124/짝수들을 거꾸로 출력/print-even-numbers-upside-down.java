import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0;i<a;i++){
            int b =Integer.parseInt(st.nextToken());
            if (b%2==0){
                arr.add(b);
            }
        }
        for (int i = 0; i<arr.size();i++){
            System.out.print(arr.get(arr.size()-1-i)+" ");
        }
    }
}