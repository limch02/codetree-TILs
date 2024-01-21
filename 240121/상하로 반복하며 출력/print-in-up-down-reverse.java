import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            for(int i = 1 ;i<=n;i++){
                for (int j = 1; j<=n;j++){
                    if (j%2==1){
                        System.out.print(i);
                    }else {
                        System.out.print(n-i+1);
                    }
                }
                System.out.println();
            }
        }
    }