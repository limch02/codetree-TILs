import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum =0;
        for (int i =0;i<4;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int j = 0;j<4;j++){
                int a =Integer.parseInt(st.nextToken());
                if (j<=i){
                    sum +=a;
                }
            }
        }
        System.out.println(sum);
    }
}