package 자동차만들기;

class SportsCar extends Car implements Aircon, Audio {

    private boolean aircon;
    private boolean audio;
    public SportsCar(String name) {
        super(name);
        this.fuelEffi = 8.0;
        this.speed = 250;
        this.fuelTank = 30;
        this.seats = 2;
    }
    public void setMode(boolean isOn) {
        if (isOn) this.speed *= 1.2; // 터보: 속도 20% 증가
    }

    @Override
    public void setAircon(boolean on) {
        this.aircon = on;
        if (on) this.fuelEffi *= 0.95;
    }

    @Override
    public boolean isAirconOn() {
        return aircon;
    }

    @Override
    public void setAudio(boolean on) {
        this.audio = on;
    }

    @Override
    public boolean isAudioOn() {
        return audio;
    }

    @Override
    public void showStatus() {
        System.out.println("에어컨 : " + (aircon ? "ON" : "OFF"));
        System.out.println("오디오 : " + (audio ? "ON" : "OFF"));
    }
}

// 승용차
class Sedan extends Car implements Aircon, Audio, AutoPilot{
    private boolean aircon;
    private boolean audio;
    private boolean autopilot;
    public Sedan(String name) {
        super(name);
        this.fuelEffi = 12.0;
        this.speed = 200;
        this.fuelTank = 45;
        this.seats = 4;
    }
    public void setMode(boolean isOn) {
        if (isOn) this.seats += 1; // 트렁크 좌석화: 1석 추가
    }

    @Override
    public void setAircon(boolean on) {
        this.aircon = on;
        if (on) this.fuelEffi *= 0.95;
    }

    @Override
    public boolean isAirconOn() {
        return aircon;
    }

    @Override
    public void setAudio(boolean on) {
        this.audio = on;
    }

    @Override
    public boolean isAudioOn() {
        return audio;
    }

    @Override
    public void setAutoPilot(boolean on) {
        this.autopilot = on;
        if (on) this.speed *= 0.9;
    }

    @Override
    public boolean isAutoPilotOn() {
        return autopilot;
    }

    @Override
    public void showStatus() {
        System.out.println(" 에어컨 : " + (aircon ? "ON" : "OFF"));
        System.out.println(" 오디오 : " + (audio ? "ON" : "OFF"));
        System.out.println(" 자율주행 : " + (autopilot ? "ON" : "OFF"));
    }
}

// 버스
class Bus extends Car implements Aircon, AutoPilot {
    private boolean aircon;
    private boolean autopilot;
    public Bus(String name) {
        super(name);
        this.fuelEffi = 5.0;
        this.speed = 150;
        this.fuelTank = 100;
        this.seats = 20;
    }
    public void setMode(boolean isOn) {
        if (isOn) this.fuelTank += 30; // 보조 탱크: 30L 추가
    }

    @Override
    public void setAircon(boolean on) {
        this.aircon = on;
        if (on) this.fuelEffi *= 0.95;
    }

    @Override
    public boolean isAirconOn() {
        return aircon;
    }

    @Override
    public void setAutoPilot(boolean on) {
        this.autopilot= on;
        if (on) this.speed *= 0.9;
    }

    @Override
    public boolean isAutoPilotOn() {
        return autopilot;
    }

    @Override
    public void showStatus() {
        System.out.println("에어컨 : " + (aircon ? "ON" : "OFF"));
        System.out.println("자율주행 : " + (autopilot ? "ON" : "OFF"));
    }
}