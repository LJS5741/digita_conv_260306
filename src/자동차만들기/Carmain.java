package 자동차만들기;

import java.util.Scanner;

public class    Carmain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 1. 지역 선택
        System.out.print("이동 지역 선택 [1]부산(400km) [2]대전(150km) [3]강릉(200km) [4]광주(300km) : ");
        int locIdx = sc.nextInt();
        int dist = 0;
        switch(locIdx) {
            case 1: dist = 400; break;
            case 2: dist = 150; break;
            case 3: dist = 200; break;
            case 4: dist = 300; break;
            default: System.out.println("지역을 잘못 선택하셨습니다."); return;
        }

        // 2. 승객 수 입력
        System.out.print("승객 수 입력 (1~100): ");
        int passengers = sc.nextInt();
        if (passengers < 1 || passengers > 100) {
            System.out.println("승객 인원 초과입니다.");
            return;
        }

        // 3. 차량 선택
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carType = sc.nextInt();
        Car car = null;
        if (carType == 1) car = new SportsCar("포르쉐 911");
        else if (carType == 2) car = new Sedan("그랜저");
        else if (carType == 3) car = new Bus("고속버스");
        else { System.out.println("차량을 잘못 선택하셨습니다."); return; }

        // 4. 부가기능 및 날씨
        System.out.print("부가기능 [1]ON [2]OFF : ");
        int mode = sc.nextInt();
        switch (mode) {
            case 1:
                car.setMode(true);
                break;
            case 2:
                car.setMode(false);
                break;
            default:
                System.out.println("부가기능을 잘못 선택하셨습니다.");
        }

        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int weather = sc.nextInt();
        double weatherMod;
        switch (weather) {
            case 1:
                weatherMod = 1.0;
                break;
            case 2:
                weatherMod = 1.2;
                break;
            case 3:
                weatherMod = 1.4;
                break;
            default:
                System.out.println("날씨를 잘못 선택하셨습니다.");
                return;
        }

        // --- 계산 로직 ---
        int trips = car.getTripCount(passengers);
        int totalDist = dist * trips;
        int totalCost = car.getTotalCost(totalDist);
        int refuelCount = car.getRefuelCount(totalDist);
        double totalTime = car.getTotalTime(totalDist, weatherMod);

        // 시간 포맷 변환 (소수점 -> 시/분)
        int hours = (int) totalTime;
        int minutes = (int) ((totalTime - hours) * 60);

        // 결과 출력
        System.out.println("\n====== " + car.getName() + " ======");
        System.out.printf("총 비용 : %,d원\n", totalCost);
        System.out.println("총 주유 횟수 : " + refuelCount + "회");
        System.out.println("총 이동 시간 : " + hours + "시간 " + minutes + "분");
    }
}
