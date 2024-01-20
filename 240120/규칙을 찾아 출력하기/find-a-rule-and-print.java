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
        for(int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i==0||j==0||i==n-1){
                    if (j == n-1){
                        System.out.println("* ");
                    }else {
                        System.out.print("* ");
                    }
                } else if (j==n-1) {
                    System.out.println("* ");
                }else if (i>j) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
    }
}