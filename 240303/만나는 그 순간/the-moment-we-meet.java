import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        int a=0;
        int b =0;
        arrA.add(a);
        arrB.add(b);
        for (int i =0;i<n;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            String move = s.nextToken();
            if (move.equals("L")) {
                int k = Integer.parseInt(s.nextToken());
                for (int j = 0;j<k;j++){
                    arrA.add(--a);
                }
            }else {
                int k = Integer.parseInt(s.nextToken());
                for (int j = 0;j<k;j++){
                    arrA.add(++a);
                }
            }
        }
        for (int i =0;i<m;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            String mo = s.nextToken();
            if (mo.equals("L")) {
                int l = Integer.parseInt(s.nextToken());
                for (int j = 0;j<l;j++){
                    arrB.add(--b);
                }
            }else {
                int l = Integer.parseInt(s.nextToken());
                for (int j = 0;j<l;j++){
                    arrB.add(++b);
                }
            }
        }
        boolean t = false;
        int idx = 0;
        for (int i =1;i<arrA.size();i++){
            if (arrA.get(i).equals(arrB.get(i))) {
                t =true;
                idx = i;
                break;
            }
        }
        if (t){
            System.out.println(idx);
        }else {
            System.out.println(-1);
        }
    }
}