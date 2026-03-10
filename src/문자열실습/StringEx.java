package 문자열실습;
// 1번 : 입력 맏은 문자열에 대해 대/소문자 변경
// 입력 : AbCdEfG => aBcDeFg
// 문자열에서 charAt()를 이용해 문자를 추출하고 추출된 문자가 대문자인지 소문자인지 판별해서 풀기

// 2번 : 문자열 추가 하기 : length(), sustring()
// 2개의 문자열을 포인터 변수 s와 k에, 양의 정수를 정수형 변수 n에 각각 전달 받아,
// s 문자열의 뒤 부분의 n개 문자를 k문자열 앞에 끼워 넣는 코드 작성
// 입력 : s = "seoul", k = "korea", n = 2
// 결과 : ulkorea

// 3번 : 알고리즘 문제 풀이 > 3단계 - 중급문제 > KMP는 왜 KMP일까?
// 입력 : Knuth-Morris-Pratt => KMP
// - 대문자만 골라내서 출력 하는 방법
// - 첫번째 문자 출력 이후 '-'문자를 찾아서 그 다음에 오는 문자 출력
// - split("-") 문자열을 부분 문자열로 분리하고 부분 문자열의 첫번째 문자 출력
// - 문자열을 문자배열로 바꾸고 ASCII 코드값으로 대문자 추출 하는 방식

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str1 = sc.next();
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }

        }
        System.out.println(result);


        System.out.print("s = ");
        String s = sc.nextLine();
        System.out.print("k = ");
        String k = sc.nextLine();
        System.out.print("n = ");
        int n = sc.nextInt();
        String total = s.substring(s.length() - n) + k;
        System.out.println(total);


        System.out.print("이름 입력 : ");
        String name1 = sc.nextLine();
        String[] str = name1.split("-");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].charAt(0));
        }



    }
}
