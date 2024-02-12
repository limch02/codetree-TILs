import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer>arr =new ArrayList<>();
        arr.add(Integer.parseInt(st.nextToken()));
        sb.append(arr.get(0)).append(" ");
        int k = 1;
        for (int i =0;i<a/2;i++){
            for (int j =0;j<2;j++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            sb.append(arr.get(k)).append(" ");
            k++;
        }
        System.out.println(sb);
    }
}