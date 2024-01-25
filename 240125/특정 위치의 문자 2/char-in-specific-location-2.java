import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i = 0 ; i<10;i++){
            if (i==1||i==4||i==7){
                System.out.print(st.nextToken()+" ");
            }else {
                st.nextToken();
            }
        }
    }
}