package 배열실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력 받기 (5개의 가격을 연속으로 입력 받음)
// 세트 메뉴 가격 = (행버거 3개 중 가장 싼 메뉴 가격 + 음료 둘 중 싼 메뉴 가격) - 50(세트 할인)

import java.util.Scanner;

// 실습 문제 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수 배열에 나누어 담아서 출력 하기
public class ArrayEx1 {
    public static void main(String[] args) {
        // 실습 문제 1번
        hamburgerEx();
    }

    static void hamburgerEx() {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        System.out.print("햄버거 가격 : ");

        for (int i = 0; burger.length > i; i++) {
            burger[i] = sc.nextInt();
        }
        System.out.print("음료 가격 : ");
        for (int i = 0; drink.length > i; i++) {
            drink[i] = sc.nextInt();
        }
        System.out.printf("%d %3d %3d %3d %3d\n", burger[0], burger[1], burger[2], drink[0], drink[1]);

        int burgermin = burger[1];
        for (int i = 1; burger.length > i; i++) {
            if (burger[i] < burgermin) {
                burgermin = burger[i];
            }
        }
        System.out.printf("버거 최솟값 : %d\n", burgermin);
        int drinkmin = drink[1];
        for (int i = 1; drink.length > i; i++) {
            if (drink[i] < drinkmin) {
                drinkmin = drink[i];
            }
        }
        System.out.printf("음료 최솟값 : %d\n", drinkmin);
        int set = (burgermin + drinkmin) - 50;
        System.out.printf("세트 메뉴 가격 : %d", set);
    }

    static void evenOddEx() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] num1 = new int[8];
        int[] num2 = new int[8];
        int num1Index = 0;
        int num2Index = 0;
        System.out.println("정수 8개 입력 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                num1[num1Index] = arr[i];
                num1Index++;
            }
            if (arr[i] % 2 != 0) {
                num2[num2Index] = arr[i];
                num2Index++;
            }
        }
        System.out.print("홀수 : ");
        for (int i = 0; i < num1Index; i++) {
            System.out.print(num1[i] + " ");
        }

        System.out.println();

        System.out.print("짝수 : ");
        for (int i = 0; i < num2Index; i++) {
            System.out.print(num2[i] + " ");
        }
    }
}
