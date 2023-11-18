import java.io.*;
import java.util.*;

public class Main {
    static public class RadixBasic {
        // 10진수 기준으로 구현
        private static final int BUCKET_NUM = 10;

        public static void sort(int[] arr) {
            // 10진수 버킷 생성
            Queue<Integer>[] bucket = new LinkedList[BUCKET_NUM];
            for (int i = 0; i < BUCKET_NUM; i++) {
                bucket[i] = new LinkedList<>();
            }

            int maxLen = maxDigitCount(arr);
            // 각 자리수의 숫자 저장
            int digitNumber = 0;
            // 배열에 다시 저장할 때 필요한 변수
            int arrIndex = 0;

            // 자리수만큼 반복
            for (int i = 0; i < maxLen; i++) {
                // 데이터의 개수만큼 반복
                for (int j = 0; j < arr.length; j++) {
                    digitNumber = getDigit(arr[j], i);

                    bucket[digitNumber].add(arr[j]);
                }

                // 버킷에 들어간 데이터를 순서대로 꺼내 배열에 덮어씌움
                for (int j = 0; j < BUCKET_NUM; j++) {
                    while (!bucket[j].isEmpty()) {
                        arr[arrIndex++] = bucket[j].remove();
                    }
                }
                arrIndex = 0;
            }
        }
        private static int getDigit(int num, int index) {
            return (int) Math.floor(Math.abs(num) / Math.pow(10, index)) % 10;
        }
        private static int digitCount(int num) {
            if (num == 0) {
                return 1;
            }
            return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
        }
        private static int maxDigitCount(int[] arr) {
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, digitCount(arr[i]));
            }

            return max;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        RadixBasic.sort(arr);
        for (int i=0;i<a;i++){
            bw.write(arr[i]+" ");
        }
        bw.close();
    }
}