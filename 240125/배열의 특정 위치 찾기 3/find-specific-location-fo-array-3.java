import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int [] arr = new int[10];
        int sum =0;
        for (int i = 0 ; i<10;i++){
            int k =Integer.parseInt(st.nextToken());
            arr[i] =k;
            if (k == 0){
                sum = arr[i-1]+arr[i-2]+arr[i-3];
                break;
            }
        }
        System.out.println(sum);
    }
}