import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        
        Map<String, Integer> wordGroups = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray); // 단어를 알파벳 순으로 정렬하여 동일한 그룹인지 확인
            
            String sortedWord = new String(charArray);
            wordGroups.put(sortedWord, wordGroups.getOrDefault(sortedWord, 0) + 1);
        }
        
        int maxGroupSize = 0;
        for (int count : wordGroups.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }
        
        System.out.println(maxGroupSize);
    }
}