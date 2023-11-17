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
            int min = arr[i];
            for (int j =i+1;j<a;j++){
                if (arr[j]<min){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        for (int i=0;i<a;i++){
            bw.write(arr[i]+" ");
        }
        bw.close();
    }
}