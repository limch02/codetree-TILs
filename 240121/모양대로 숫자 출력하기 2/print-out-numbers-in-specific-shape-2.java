import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 2;
            for(int i = 0 ;i<n;i++){
                for (int j = 0; j<n;j++){
                    if (cnt == 10){
                        cnt = 2;
                    }
                    System.out.print(cnt+" ");
                    cnt+=2;
                }
                System.out.println();
            }
        }
    }