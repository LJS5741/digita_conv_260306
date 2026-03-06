package 시스템출력실습;

/*================================
나를 소개합니다!
        ================================
이름   : 곰돌이
나이   : 25세
취미   : 코딩, 독서, 운동
한마디 : "안녕하세요, 잘 부탁드립니다!"
        ================================
 */

public class SystemOutEx {
    public static void main(String[] args) {
        String name = "이지성";
        int age = 25;
        String hobby = "운동, 게임, 야구";
        String a = "안녕하세요, 잘 부탁드립니다!";
        System.out.println("================================");
        System.out.println("나를 소개합니다!");
        System.out.println("================================");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("취미 : " + hobby);
        System.out.println("한마디 : " + a);
        System.out.println("================================");


        int americanoQty = 2;
        int americanoPrice = 4500;

        int latteQty = 1;
        int lattePrice = 5500;

        int cakeQty = 1;
        int cakePrice = 6800;

        int americano = americanoPrice * americanoQty;
        int latte = lattePrice * latteQty;
        int cake = cakePrice * cakeQty;

        int total = americano + latte + cake;

        System.out.println("================================");
        System.out.println("JAVA CAFE 영수증");
        System.out.println("================================");
        System.out.printf("%-15s %5d잔 %,5d원%n", "아메리카노", americanoQty, americano);
        System.out.printf("%-15s %6d잔 %,5d원%n", "카페라떼", latteQty, latte);
        System.out.printf("%-15s %5d잔 %,5d원%n", "치즈케이크", cakeQty, cake);

        int i = 3;

        System.out.println("3 X 1 = " + (3 * 1));
        System.out.println("3 X 2 = " + (3 * 2));
        System.out.println("3 X 3 = " + (3 * 3));
        System.out.println("3 X 4 = " + (3 * 4));
        System.out.println("3 X 5 = " + (3 * 5));
        System.out.println("3 X 6 = " + (3 * 6));
        System.out.println("3 X 7 = " + (3 * 7));
        System.out.println("3 X 8 = " + (3 * 8));
        System.out.println("3 X 9 = " + (3 * 9));







    }
}
