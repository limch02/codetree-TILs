import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 1;i<=n;i++){
            if (i%2==1){
                System.out.println("*");
            }else {
                for (int j = 0;j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}