package sec01;

//제네릭 EX

public class GenericExam {
    public static void main(String[] args) {
        //Box<String> box1 = new Box<String>();
        Box<String> box1 = new Box<>();   //양쪽의 값이 같을때는 <>"String" 생략
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        //Box<String> box1 = new Box<String>();
        Box<Integer> box2 = new Box<>();   //양쪽의 값이 같을때는 <>"Integer" 생략
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
