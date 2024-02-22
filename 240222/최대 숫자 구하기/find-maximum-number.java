import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr =new ArrayList<>();
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i=1;i<=b;i++){
            arr.add(i);
        }
        for (int i = 0;i<a;i++){
            int c = Integer.parseInt(s.nextToken());
            if (c>=arr.size()){
                arr.remove(arr.size()-1);
            }else {
                arr.remove(c-1);
            }
            Collections.sort(arr);
            System.out.println(arr.get(arr.size()-1));
        }
    }
}