package 자동차만들기;

public abstract class Car {
    protected String name;        // 차량 이름
    protected int speed;          // 속도 (km/h)
    protected double fuelEffi;    // 연비 (km/L)
    protected int fuelTank;       // 연료탱크 크기 (L)
    protected int seats;          // 좌석 수

    public static final int GAS_PRICE = 2000; // 기름값 상수

    public Car(String name) {
        this.name = name;
    }

    // [공통 기능] 총 이동 횟수 계산
    public int getTripCount(int passengers) {
        return (int) Math.ceil((double) passengers / seats);
    }

    // [공통 기능] 주유 횟수 계산 (출발 전 연료 0 가정)
    public int getRefuelCount(int totalDist) {
        double totalFuelNeeded = (double) totalDist / fuelEffi;
        return (int) Math.ceil(totalFuelNeeded / fuelTank);
    }

    // [공통 기능] 총 비용 계산
    public int getTotalCost(int totalDist) {
        double totalFuelNeeded = (double) totalDist / fuelEffi;
        return (int) (totalFuelNeeded * GAS_PRICE);
    }

    // [공통 기능] 총 이동 시간 계산
    public double getTotalTime(int totalDist, double weatherModifier) {
        return ((double) totalDist / speed) * weatherModifier;  // 수정
    }

    // [추상 메서드] 부가모드 설정 (자식에서 구현)
    public abstract void setMode(boolean isOn);

    public String getName() { return name; }
}