import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0;i<n;i++){
            int c= Integer.parseInt(s.nextToken());
            arr.add(c);
        }
        for (int i = 0 ; i<q;i++){
            StringTokenizer k = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(k.nextToken());
            if (m == 1){
                int a = Integer.parseInt(k.nextToken());
                System.out.println(arr.get(a-1));
            } else if (m==2) {
                int b = Integer.parseInt(k.nextToken());
                boolean t = true;
                for (int j=0;j<n;j++){
                    if (b==arr.get(j)){
                        System.out.println(j+1);
                        t = true;
                        break;
                    }else {
                        t =false;
                    }
                }
                if (!t){
                    System.out.println(0);
                }
            }else {
                int c = Integer.parseInt(k.nextToken());
                int d = Integer.parseInt(k.nextToken());
                for (int l = c ;l<=d;l++){
                    System.out.print(arr.get(l-1)+" ");
                }
                System.out.println();
            }
        }
    }
}