package 조건문실습;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = "";
        int price = 0;

        // 메뉴판 출력
        System.out.println("=".repeat(32));
        System.out.println("자판기에 오신걸 환영합니다!");
        System.out.println("=".repeat(32));
        System.out.println("1. 콜라 - 1,500원");
        System.out.println("2. 사이다 - 1500원");
        System.out.println("3. 커피 - 1000원");
        System.out.println("4. 생수 - 500원");
        System.out.println("=".repeat(32));

        // 투입 금액 입력 받기
        System.out.print("투입 금액 입력 : ");
        int money = sc.nextInt();

        //메뉴 번호 입력 받기
        System.out.print("메뉴 번호 선택 : ");




        for (int i = 0; i < 100; i++) {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    product = "콜라";
                    price = 1500;
                    break;
                case 2:
                    product = "사이다";
                    price = 1500;
                    break;
                case 3:
                    product = "커피";
                    price = 1000;
                    break;
                case 4:
                    product = "생수";
                    price = 500;
                    break;
                default:
                    System.out.print("다시 입력해주세요 : ");
                    continue;
            }
            break;
        }
        if (money >= price) {
            int change = money - price;
            System.out.println("=".repeat(32));
            System.out.println(product + "가 나왔습니다!");
            System.out.println("투입 금액 : " + money);
            System.out.println("상품 금액 : " + price);
            System.out.println("거스름 돈 : " + change);
        } else {
            int need = price - money;
            System.out.println("잔액이 부족합니다");
            System.out.println("투입 금액 : " + money);
            System.out.println("필요 금액 : " + price);
            System.out.println("부족 금액 : " + need);
        }
        System.out.println("=".repeat(32));








    }
}
