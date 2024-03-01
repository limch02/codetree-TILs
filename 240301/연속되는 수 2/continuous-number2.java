import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int cnt =0;
        int last = -1;
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if (b!=last){
                cnt++;
                last = b;
            }
        }
        System.out.println(cnt);
    }
}