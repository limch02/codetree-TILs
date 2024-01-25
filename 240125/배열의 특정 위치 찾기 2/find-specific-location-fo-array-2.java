import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int sumo = 0;
        int suma = 0;
        for (int i = 0 ; i<10;i++){
            if (i%2==0){
                suma+=Integer.parseInt(st.nextToken());
            }else {
                sumo+=Integer.parseInt(st.nextToken());
            }
        }
        if (suma>=sumo){
            System.out.println(suma-sumo);
        }else {
            System.out.println(sumo-suma);
        }
    }
}