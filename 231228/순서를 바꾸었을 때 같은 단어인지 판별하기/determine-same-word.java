import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a1 = st.nextToken();
        String a2 = br.readLine();
        char[] chars = a1.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        char[] c = a2.toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);
        if (a1.length()==a2.length()) {

            if (sorted.equals(sortedStr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }
    }
}