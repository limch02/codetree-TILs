import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()){
            int d = Integer.parseInt(st.nextToken());
            if (d == 0){
                break;
            }else {
                arr.add(d);
            }
        }
        for (int i = 0 ; i<arr.size();i++){
            System.out.print(arr.get(arr.size()-1-i)+" ");
        }
    }
}