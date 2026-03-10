package 배열실습문제;
// 알고리즘 문제풀이 > 3단계 중급 문제 > 핸드폰 요금
// - 영식 요금제 : 30초마다 10원, 기본 통화 10
// - 민식 요금제 : 60초마다 15원, 기본 통화 15
// - 통화의 개수 : 20
// - 통화 시간은 10000보다 작은 자연수
// 알고리즘 문제풀이 > 3단계 중급 문제 > 저항
// - 3개 저항값을 색상으로 입력
// - 첫번째: 10의 자리 값
// - 두번째 : 1의 자리 값
// - 세번째 : 곱의 자리

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        ex1();
        ex2();

    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 통화 개수

        int yCost = 0;
        int mCost = 0;

        for (int i = 0; i < N; i++) {
            int time = sc.nextInt();

            yCost += ((time / 30) + 1) * 10;
            mCost += ((time / 60) + 1) * 15;
        }
        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y" + yCost);
            System.out.println("M " + mCost);
        }
        sc.nextLine();
    }
    static void ex2() {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange",
                "yellow", "green", "blue", "violet", "grey", "white"};
        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000,
                10000000, 100000000, 1000000000};
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (color1.equals(color[i])) val1 = i;
            if (color2.equals(color[i])) val2 = i;
            if (color3.equals(color[i])) val3 = mul[i];
        }
        System.out.println(((val1 * 10) + val2) * val3);
    }
}




