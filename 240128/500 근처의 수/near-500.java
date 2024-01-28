import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arru = new ArrayList<>();
        ArrayList<Integer> arrh = new ArrayList<>();
        for (int i = 0;i<10;i++){
            int a = Integer.parseInt(st.nextToken());
            if (a<500){
                arru.add(a);
            }else {
                arrh.add(a);
            }
        }
        Collections.sort(arru);
        Collections.sort(arrh);
        System.out.println(arru.get(arru.size()-1)+" "+arrh.get(0));
    }
}