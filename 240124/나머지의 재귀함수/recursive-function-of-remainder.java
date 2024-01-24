import java.io.*;
import java.util.*;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int abc(int a) {
        if (a == 1) {
            return 2;
        } else if (a == 2) {
            return 4;
        } else {
            if (memo.containsKey(a)) {
                return memo.get(a);
            } else {
                int result = (abc(a - 1) * abc(a - 2)) % 100;
                memo.put(a, result);
                return result;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(abc(a));
    }
}