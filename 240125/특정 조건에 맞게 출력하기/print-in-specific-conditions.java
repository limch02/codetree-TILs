import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if (a==0){
                for (int i =0;i<arr.size();i++){
                    if (arr.get(i)%2==0){
                        System.out.print(arr.get(i)/2+" ");
                    }else {
                        System.out.print((arr.get(i)+3)+" ");
                    }
                }
                break;
            }
            arr.add(a);
        }
    }
}