import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이동해야 할 거리 입력

        int distance = scanner.nextInt();

        // 가능한 최단 시간 계산
        int shortestTime = calculateShortestTime(distance);

        // 결과 출력
        System.out.println(shortestTime);

        // Scanner 닫기
        scanner.close();
    }

    // 가능한 최단 시간 계산 메소드
    private static int calculateShortestTime(int distance) {
        // 초기 속력
        int speed = 1;
        // 이동한 거리
        int totalDistance = 0;
        // 경과 시간
        int time = 0;

        while (totalDistance < distance) {
            // 현재 속력으로 1초 동안 이동한 거리 누적
            totalDistance += speed;
            // 1초 경과
            time++;

            // 도착지에 도달하기 전에 현재 속력이 1보다 크다면 1 감소
            if (speed > 1) {
                speed--;
            } else {
                // 현재 속력이 1이거나 1보다 작다면 1 증가
                speed++;
            }
        }

        return time;
    }
}