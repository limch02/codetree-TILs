import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0 ; i<10;i++){
            if (i==2||i==4||i==9){
                sum += Integer.parseInt(st.nextToken());
            }else {
                st.nextToken();
            }
        }
        System.out.print(sum);
    }
}