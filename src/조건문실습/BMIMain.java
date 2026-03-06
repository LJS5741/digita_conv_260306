package 조건문실습;
// 18.5 미만 → 저체중
// 18.5 이상 23 미만 → 정상
// 23 이상 25 미만 → 과체중
// 25 이상 → 비만

import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 스캐너 객체 생성

        // 키(cm), 몸무게 입력
        System.out.print("키 : ");
        double cm = sc.nextInt();       // 실수 타입으로 키를 입력 받음
        System.out.print("몸무게 : ");
        double kg = sc.nextDouble();

        // 키를 미터 단위로 환산 후 BMI 계산
        double m = cm / 100;
        double bmi = kg / (m * m);

        // BMI 출력
        System.out.printf("BMI : %.2f\n", bmi);

        // 조건문으로 체형 분류 후 결과 출력
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("정상");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
