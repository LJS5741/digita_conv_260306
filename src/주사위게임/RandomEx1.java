package 주사위게임;
// int rand = (int) (Math.random() * 6) + 1;    // 1 ~ 6 사이의 임의의 정수를 생성

public class RandomEx1 {
    public static void main(String[] args) {
        // 2개의 주사위를 굴려서 두 개의 주사위 수가 같은 값이 나오면 무인도 탈출하기
        // 탈출 시 두개의 주사위 값을 표시하고, 몇번만에 탈출 했는데 횟수 표시

        int count = 1;
        while (true) {
            int rand1 = (int)(Math.random() * 6) + 1;
            int rand2 = (int)(Math.random() * 6) + 1;
            if (rand1 == rand2) {
                System.out.println("주사위 1 : " + rand1);
                System.out.println("주사위 2 : " + rand2);
                break;
            }
            count++;
        }
        System.out.println("주사위 던진 횟수 : " + count);
    }
}
