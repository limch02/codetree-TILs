import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int cnt = 65;
            for(int i = 0;i<a;i++){
                for (int j = 0; j<a;j++){
                    System.out.print((char)cnt);
                    cnt++;
                }
                System.out.println();
            }
        }
    }