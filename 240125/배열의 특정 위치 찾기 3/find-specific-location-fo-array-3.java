import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum =0;
        int i =0;
        while (st.hasMoreTokens()){
            int k =Integer.parseInt(st.nextToken());
            arr.add(k);
            if (k == 0){
                sum = arr.get(i-1)+arr.get(i-2)+arr.get(i-3);
                break;
            }
            i++;
        }
        System.out.println(sum);
    }
}