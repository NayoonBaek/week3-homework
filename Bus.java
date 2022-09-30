package homework;

public class Bus extends PublicTrans {
    Bus bus = new Bus();

    int maxPass = 30;        // 최대 승객 수
    int currentPass = 0;    // 현재 승객 수

    String state = "운행";  //상태
    int price = 1000;        // 요금


    public Bus() {
        System.out.println("버스 번호 : " + num);
    }
    // 버스 상태 변경
    public void changeState(String state) {
        if (state == "운행") {
            state = "차고지행";
        }
        else if (state == "차고지행") {
            state = "운행";
        }
        if (fuel<10) {
            System.out.println("주유 필요");
        }

    }
//속도변경
    void changeSpeed(int speedUpdate) {
        if (fuel>=10) {
            speed += speedUpdate;
            System.out.println("남은 기름 : " + fuel);
            System.out.println("운행 가능");
        }else {
            System.out.println("주유가 필요합니다");
            System.out.println("운행 불가 = 차고지행");
            state = "차고지행";
        }
    }

    // 주유량
    int refuel(int oil) {
        fuel += oil;
        if (fuel<10) {
            state = "차고지행";
        }
        return fuel;

    }
    void currentBus(){
        System.out.println(state);
        System.out.println(fuel);
    }

    // 승객 탑승
    void board(int pass) {
        if (pass >= (maxPass - currentPass)) {
            System.out.println("최대 승객 수 초과");
        }else {
            currentPass += pass;
            System.out.println("탑승 승객 수 = " + pass + "명");
            System.out.println("잔여 승객 수 = " + (maxPass - currentPass) + "명");
            System.out.println("요금 확인 = " + (price * pass));
        }

    }
}
