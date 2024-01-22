import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int cnt =1;
            for(int i = 0;i<n;i++){
                for (int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for (int j=n;j>i;j--){
                    if (cnt == 10){
                        cnt = 1;
                    }
                    System.out.print(cnt+" ");
                    cnt++;
                }
                System.out.println();
            }
        }
    }