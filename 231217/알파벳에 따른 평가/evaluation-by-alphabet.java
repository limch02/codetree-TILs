import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s=br.readLine();
        if (s=="S"){
            bw.write("Superior");
        } else if (s=="A") {
            bw.write("Excellent");
        } else if (s=="B"){
            bw.write("Good");
        }else if(s=="C"){
            bw.write("Usually");
        }else if(s=="D"){
            bw.write("Effort");
        }else{
            bw.write("Failure");
        }
        bw.close();
    }
}