package 표준입력;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        // 키보드를 통한 입력을 받기 위해 스캐너 클래스에 대한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

//        byte a = sc.nextByte();     // 스캐너 객체의 참조를 통해서 byte 타입의 값을 입력 받아 a 변수에 대입
//        short b = sc.nextShort();
//        int c = sc.nextInt();
//        long d = sc.nextLong();
//        float e = sc.nextFloat();
//        double f = sc.nextDouble();
//
//        // 문자와 문자열
//        String name = sc.next();        // 공백 기준으로 문자열을 입력 받음
//        String addr = sc.nextLine();    // 줄바꿈 기준으로 문자열을 입력 받음
//        char ch = sc.next().charAt(0);  // 문자열에서 맨앞의 문자 추출
        // 이름은 next()
        // 주소는 nexLine()
        // 성별은 next().charAt(0) 'M'/'F'로 입력 받아서 출력은 "남성", "여성"출력
        // 직업은 [1]회사원 [2]학생 [3]주부 [4]무직 : 정수로 입력 받아 문자열로 출력
        // 나이 nextInt(_) 입력
        // 입력 완료 시 결과를 출력

        System.out.print("이름 입력 : ");
        String name = sc.next();

        sc.nextLine();
        System.out.print("주소 입력 : ");
        String address = sc.nextLine();

        System.out.print("성별 입력 (M/F) : ");
        char gender = sc.next().charAt(0);

        String genderStr;
        if (gender == 'M' || gender == 'm') {
            genderStr = "남성";
        } else {
            genderStr = "여성";
        }

        System.out.println("직업 선택");
        System.out.println("[1]회사원 [2]학생 [3]주부 [4]무직");
        System.out.print("번호 입력 : ");
        int job = sc.nextInt();

        String jobStr = "";

        if (job == 1) {
            jobStr = "회사원";
        }
        else if (job == 2) {
            jobStr = "학생";
        }
        else if (job == 3) {
            jobStr = "주부";
        }
        else if (job == 4) {
            jobStr = "무직";
        }

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        System.out.println("\n===== 입력 결과 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + genderStr);
        System.out.println("직업 : " + jobStr);
        System.out.println("나이 : " + age);

        sc.close();


    }


}

