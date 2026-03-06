package For문;
// for(초기값;최종값;증감값) { }

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        for(int i = 0; i < num; i++) {
//            System.out.print("★");
//        }
//        System.out.println();

        // 정수값을 입력 받음
        // 입력 받은 정수값 범위의 5의 배수를 1줄에 10개씩 출력 하기

//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();
//        int count = 0;
//        for (int i = 1; i < num; i++) {
//            if ((i % 5 == 0)) {
//                System.out.printf("%d ", i);
//                count++;
//                if (count == 10) {
//                    System.out.println();
//                    count = 0;
//                }
//            }
//        }

        // 정수 num을 입력 받아 num * num 출력하기
        // 입력 : 4
        //  1   2   3   4
        //  5   6   7   8
        //  9  10  11  12
        // 13  14  15  16

//        System.out.print("정수 입력 : ");
//        int num1 = sc.nextInt();
//        int cnt= 0;
//
//        for (int i = 1; i <= num1 * num1; i++) {
//            System.out.printf("%4d", i);
//            cnt++;
//            if (i % num1 == 0) {
//                System.out.println();
//
//            }
//        }


        // 문자열을 입력 받아 역순으로 출력 하기
        // "ABCDEFG" => GFEDCBA"

        System.out.print("문자열 입력 : ");
        String eng = sc.next();
        for(int i = eng.length() - 1; i >= 0; i--) {
            System.out.print(eng.charAt(i));
        }



    }
}
