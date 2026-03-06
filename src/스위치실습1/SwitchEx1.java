package 스위치실습1;
// 좌변 값, 연산자, 우변 값을 입력 받아 산술 연산(+. -. *. . %)을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68


import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("좌변 : ");
        int num1 = sc.nextInt();
        System.out.print("연산자 : ");
        char op = sc.next().charAt(0);
        System.out.print("우변 : ");
        int num2 = sc.nextInt();


        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }





    }
}
