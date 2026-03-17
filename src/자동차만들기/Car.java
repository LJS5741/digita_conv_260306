package 자동차만들기;

public abstract class Car {
    protected int speed;          // 속도 (km/h)
    protected double fuelEffi;    // 연비 (km/L)
    protected int fuelTank;       // 연료탱크 크기 (L)
    protected int seats;          // 좌석 수
    protected String name;        // 차량 이름

    public Car(String name) {
        this.name = name;
    }

    // [추상 메서드] 부가모드 설정 (자식에서 구현)
    public abstract void setMode(boolean isOn);

    public abstract void showStatus();

}