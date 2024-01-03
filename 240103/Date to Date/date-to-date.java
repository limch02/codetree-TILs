import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken()), day = Integer.parseInt(st.nextToken());
        int gh = Integer.parseInt(st.nextToken());
        int gm = Integer.parseInt(st.nextToken());
        int elapsedDays = 1;
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(month == gh && day == gm)
                break;

            elapsedDays++;
            day++;

            if(day > num_of_days[month]) {
                month++;
                day = 1;
            }
        }

        System.out.print(elapsedDays);

    }
}