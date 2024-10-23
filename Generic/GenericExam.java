package src.sec03;

public class GenericExam {

    //제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {

        Box<Integer>box1 = boxing(100);
        int inValue = box1.get();
        System.out.println(inValue);

        Box<String>box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
