package 다형성2번;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        // 운전자 생성
        // 1. 버스
        // 2. 택시
        // 3. 스포츠카
        Vehicle vehicle = new Vehicle();
        Driver driver = new Driver("이지성");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 버스");
            System.out.println("2. 택시");
            System.out.println("3. 스포츠카");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    driver.drive(new Bus());
                    break;
                case 2:
                    driver.drive(new Taxi());
                    break;
                case 3:
                    driver.drive(new SportCar());
                    break;
            }
        }
    }
}
