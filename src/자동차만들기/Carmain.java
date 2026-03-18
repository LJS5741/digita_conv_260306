package 자동차만들기;

import java.util.Scanner;

public class Carmain {

    public static final int PRICE = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 지역 선택
        System.out.print("이동 지역 선택 [1]부산(400km) [2]대전(150km) [3]강릉(200km) [4]광주(300km) : ");
        int locIdx = sc.nextInt();
        int distance = 0;
        switch (locIdx) {
            case 1:
                distance = 400;
                break;
            case 2:
                distance = 150;
                break;
            case 3:
                distance = 200;
                break;
            case 4:
                distance = 300;
                break;
            default:
                System.out.println("지역을 잘못 선택하셨습니다.");
                return;
        }

        // 2. 승객 수 입력
        System.out.print("이동할 승객 수 입력 : ");
        int passengers = sc.nextInt();
        if (passengers < 1 || passengers > 100) {
            System.out.println("승객 인원 초과입니다.");
            return;
        }

        // 3. 차량 선택
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carType = sc.nextInt();
        Car car = null;
        switch (carType) {
            case 1:
                car = new SportsCar("포르쉐 911");
                break;
            case 2:
                car = new Sedan("그랜저");
                break;
            case 3:
                car = new Bus("고속버스");
                break;
            default:
                System.out.println("차량을 잘못 선택하셨습니다.");
                return;
        }

        // 4. 부가기능 및 날씨
        System.out.print("부가기능 [1]ON [2]OFF : ");
        int submode = sc.nextInt();
        if (submode == 1) {
            car.setMode(true);
        }

        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int weather = sc.nextInt();
        double weatherMod = 0;
        switch (weather) {
            case 1:
                weatherMod = 1.0;
                break;
            case 2:
                weatherMod = 1.2;
                break;
            case 3:
                weatherMod = 1.4;
        }

        if (car instanceof Aircon aircon) {
            System.out.print("G80 에어컨 [1]ON [2]OFF : ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("G80 : 에어컨 ON");
                aircon.setAircon(true);
            } else {
                System.out.println("G80 : 에어컨 OFF");
                aircon.setAircon(false);
            }
        }

        if (car instanceof Audio audio) {
            System.out.print("G80 오디오 [1]ON [2]OFF : ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("G80 : 오디오 ON");
                audio.setAudio(true);
            } else {
                System.out.println("G80 : 오디오 OFF");
                audio.setAudio(false);
            }
        }
        if (car instanceof AutoPilot autoPilot) {
            System.out.print("G80 자율주행 [1]ON [2]OFF : ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("G80 : 자율주행 ON");
                autoPilot.setAutoPilot(true);
            } else {
                System.out.println("G80 : 자율주행 OFF");
                autoPilot.setAutoPilot(false);
            }
        }



        // --- 계산 로직 ---
        int NumberOfMoves = (int) Math.ceil((double)passengers/ car.seats);
        int totalDistance = distance * NumberOfMoves;
        double FuelConsumption = (double) totalDistance / car.fuelEffi;
        int refuelCount = (int) Math.ceil((double)FuelConsumption/car.fuelTank);
        double totalCost = FuelConsumption*PRICE;
        double totalTime = ((double)distance/car.speed)*NumberOfMoves*weatherMod;

        // 시간 포맷 변환 (소수점 -> 시/분)
        int hours = (int) totalTime;
        int minutes = (int) ((totalTime - hours) * 60);

        // 결과 출력
        System.out.println("\n====== " + car.name + " ======");
        System.out.printf("총 비용 : %,d원\n", (int)totalCost);
        System.out.println("총 주유 횟수 : " + refuelCount + "회");
        System.out.println("총 이동 시간 : " + hours + "시간 " + minutes + "분");
        car.showStatus();
    }
}