package 다향성3번;

import java.util.Scanner;

public class DeliverMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("배송 시스템 선택 [1]택배 배송 [2]쿽 배송 [3]항공 배송 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.send(new ParcelDelivery());
                    break;
                case 2:
                    manager.send(new QuickDelivery());
                    break;
                case 3:
                    manager.send(new AirDelivery());
                    break;
                default:
                    System.out.println("배송 시스템을 잘못 선택하셨습니다");
            }
        }
    }
}
