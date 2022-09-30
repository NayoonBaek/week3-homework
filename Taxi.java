package homework;
public class Taxi extends PublicTrans {
    Taxi taxi = new Taxi();

    int defaultprice = 3000;		// 기본 요금
    int perDistance = 1000;		// 거리당 요금
    String state = "일반";		// 상태

    int maxPass = 4;			// 최대 승객수

    int total = 0;				// 누적 금액
    int price;					// 승객이 지불할 금액



    public Taxi() {
        System.out.println("택시 번호 : "+num);
    }


    // 탑승		승객			목적지		거리
    void board(int pass, String dest, int dis) {
        if(state == "일반"&&fuel>=10) {
            if(pass > 4){
                System.out.println("최대 승객 수 초과");
            }else {
                if(dis<=1){
                    price = defaultprice+ (perDistance*dis);
                }else{
                    price = defaultprice+ (perDistance*(dis-1));
                }

                System.out.println("탑승 승객 수 = "+pass);
                System.out.println("잔여 승객 수 = "+ (maxPass-pass));
                System.out.println("기본 요금 확인 = "+defaultprice);
                System.out.println("목적지 = "+dest);
                System.out.println("목적지까지 거리 = "+ dis+"km");
                System.out.println("지불할 요금 = "+price);
                state = "운행 중";
                total += price;

            }
        }else {
            state = "탑승불가";
        }
    }
    // 주유량
    void refuel(int oil) {
        fuel += oil;
    }


    // 요금 지불
    void pay() {
        System.out.println("누적 요금 = "+ total);
        state = "일반";
        total = 0;
    }

    void passenger(int pass) {
        if(pass > 4)
            System.out.println("최대 승객 수 초과");

    }
    // 속도변경
    void changeSpeed(int acceleration) {
        //주유 상태를 체크하고 주유량이 10 이상이어야 운행할 수 있음
        if(fuel>=10) {
            speed += acceleration;

            System.out.println("현재 속도는 "+ speed+"입니다.");

        }else {
            System.out.println("주유량을 확인해주세요." + fuel);
        }
    }



}
