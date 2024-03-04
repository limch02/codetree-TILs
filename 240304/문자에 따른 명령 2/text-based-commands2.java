import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split("");
        int x = 0;
        int y = 0;
        int move = 1;
        for (int i =0;i<arr.length;i++){
            String s = arr[i];
            if (s.equals("L")) {
                if (move==1){
                    move=4;
                }else {
                    move--;
                }
            } else if (s.equals("R")) {
                if (move==4){
                    move=1;
                }else {
                    move++;
                }
            } else {
                if (move==1){
                    y++;
                } else if (move==2) {
                    x++;
                } else if (move==3) {
                    y--;
                }else {
                    x--;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}