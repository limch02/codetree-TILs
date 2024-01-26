import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[4];
        for (int i = 0 ; i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            if (s.equals("Y")) {
                if (a>=37){
                    arr[0]++;
                }else{
                    arr[2]++;
                }
            }else {
                if (a>=37){
                    arr[1]++;
                }else{
                    arr[3]++;
                }
            }
        }
        for (int i = 0 ; i<4;i++){
            System.out.print(arr[i]+" ");
        }
        if (arr[0]>=2){
            System.out.print("E");
        }
    }
}