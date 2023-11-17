import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i =0;i<a;i++){
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                arr[j + 1] = key;
            }
        }
        for (int i=0;i<a;i++){
            bw.write(arr[i]+" ");
        }
        bw.close();
    }
}