import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arrA = new int[n];
        int [] arrB = new int[m];
        Set <Integer> setA = new HashSet<>();
        Set <Integer> setB = new HashSet<>();
        Set <Integer> set = new HashSet<>();
        StringTokenizer s1 = new StringTokenizer(br.readLine());
        for (int i =0;i<n;i++){
            int a  = Integer.parseInt(s1.nextToken());
            arrA[i]= a;
            setA.add(a);
        }
        StringTokenizer s2 = new StringTokenizer(br.readLine());
        for (int i =0;i<m;i++){
            int b  = Integer.parseInt(s2.nextToken());
            arrB[i] = (b);
            setB.add(b);
        }
        for (int i =0;i<n;i++){
            if (!setB.contains(arrA[i])){
                set.add(arrA[i]);
            }
        }
        for (int i =0;i<m;i++){
            if (!setA.contains(arrB[i])){
                set.add(arrB[i]);
            }
        }
        System.out.println(set.size());
    }
}