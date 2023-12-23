import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringTokenizer s= new StringTokenizer(br.readLine());
        int arr[] = new int[a];
        for (int i = 0;i<a;i++){
            int b = Integer.parseInt(s.nextToken());
            if (b%2==0){
                arr[i] = b/2;
            }else {
                arr[i] =b;
            }
        }
        for (int i =0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}