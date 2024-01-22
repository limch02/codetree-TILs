import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 1;
            for(int i = 1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(cnt+" ");
                    cnt++;
                }
                System.out.println();
            }
        }
    }