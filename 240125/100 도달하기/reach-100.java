import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 2;
        arr.add(1);
        arr.add(a);
        while (true){
            arr.add(arr.get(i-1)+arr.get(i-2));
            if (arr.get(i)>=100) {
                for (int j = 0; j < arr.size(); j++) {
                    System.out.print(arr.get(j)+" ");
                }
                break;
            }
            i++;
        }
    }
}