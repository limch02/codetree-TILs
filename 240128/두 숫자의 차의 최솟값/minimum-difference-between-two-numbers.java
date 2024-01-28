import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int min =Integer.MAX_VALUE;
        for (int i = 0;i<a;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        for (int i =0;i<a;i++){
            for (int j =i+1;j<a;j++){
                if (arr.get(j)-arr.get(i)<min){
                    min = arr.get(j)-arr.get(i);
                }
            }
        }
        System.out.println(min);
    }
}