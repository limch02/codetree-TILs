import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0;j<3;j++){
                String c = st.nextToken();
                sb.append(c.toUpperCase(Locale.ROOT)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}