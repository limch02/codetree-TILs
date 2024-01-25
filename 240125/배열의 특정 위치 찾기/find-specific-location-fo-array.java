import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int suma = 0;
        double sumb = 0;
        for (int i = 0 ; i<10;i++){
            int k =Integer.parseInt(st.nextToken());
            if (i%2==1){
                suma += k;
            }
            if((i+1)%3==0){
                sumb += k;
            }

        }
        String s = String.format("%.1f",sumb/3);
        System.out.print(suma+" "+s);
    }
}