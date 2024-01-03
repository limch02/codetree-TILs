import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken()), mins = Integer.parseInt(st.nextToken());
        int gh = Integer.parseInt(st.nextToken());
        int gm = Integer.parseInt(st.nextToken());
        int elapsedTime = 0;

        while(true) {
            if(hour == gh&& mins == gm)
                break;

            elapsedTime++;
            mins++;

            if(mins == 60) {
                hour++;
                mins = 0;
            }
        }

        System.out.print(elapsedTime);
    }
}