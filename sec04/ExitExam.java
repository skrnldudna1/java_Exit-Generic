package sec04;

// i 가 5가 되면 프로세스를 정상 종료한다.
public class ExitExam {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){

            System.out.print(i+" ");
            if (i == 5) {
                System.out.println("프로세스 강제종료");
                System.exit(0);   //정상종료 0 , 비정상이면 1
            }
        }
    }
}
