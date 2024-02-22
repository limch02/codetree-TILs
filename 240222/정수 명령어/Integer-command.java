import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0;j<b;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int c = Integer.parseInt(st.nextToken());
                if (s.equals("I")) {
                    arr.add(c);
                }else {
                    if (!arr.isEmpty()) {
                        Collections.sort(arr);
                        if (c == 1) {
                            arr.remove(arr.size() - 1);
                        } else {
                            arr.remove(0);
                        }
                    }
                }
            }
            if (arr.isEmpty()){
                System.out.println("EMPTY");
            }else{
                System.out.println(arr.get(arr.size()-1)+" " +arr.get(0));
            }
        }
    }
}