package sec04;

//1부터 1000000까지의 합을 구하는데 걸린 시간을 출력

public class MeasureRunTimeRxam {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;
        for (int i =1; i <= 1000000; i++){
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("1~1000000까지의 합: " + sum);
        System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
    }
}
//결과 값은 컴퓨터의 환경과 사양에 따라 달라질 수 있다.
