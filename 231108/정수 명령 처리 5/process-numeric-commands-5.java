import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a= Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch(s){
                case "push_back": list.add(Integer.parseInt(st.nextToken())); break;
                case "pop_back": list.remove(list.size()-1); break;
                case "size": bw.write(list.size()+"\n");break;
                case "get": bw.write(list.get(Integer.parseInt(st.nextToken())-1)+"\n"); break;
            }
        }
        bw.close();
    }
}