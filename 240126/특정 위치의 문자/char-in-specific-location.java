import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = {"L","E","B","R","O","S"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        boolean k = true;
        for (int i = 0 ; i<arr.length;i++){
            if (s.equals(arr[i])){
                System.out.println(i);
                k = true;
                break;
            }else {
                k = false;
            }
        }
        if (!k){
            System.out.println("None");
        }
    }
}