package 자동차만들기;

class SportsCar extends Car {
    public SportsCar(String name) {
        super(name);
        this.fuelEffi = 8.0;
        this.speed = 250;
        this.fuelTank = 30;
        this.seats = 2;
    }
    @Override
    public void setMode(boolean isOn) {
        if (isOn) this.speed *= 1.2; // 터보: 속도 20% 증가
    }
}

// 승용차
class Sedan extends Car {
    public Sedan(String name) {
        super(name);
        this.fuelEffi = 12.0;
        this.speed = 200;
        this.fuelTank = 45;
        this.seats = 4;
    }
    @Override
    public void setMode(boolean isOn) {
        if (isOn) this.seats += 1; // 트렁크 좌석화: 1석 추가
    }
}

// 버스
class Bus extends Car {
    public Bus(String name) {
        super(name);
        this.fuelEffi = 5.0;
        this.speed = 150;
        this.fuelTank = 100;
        this.seats = 20;
    }
    @Override
    public void setMode(boolean isOn) {
        if (isOn) this.fuelTank += 30; // 보조 탱크: 30L 추가
    }
}