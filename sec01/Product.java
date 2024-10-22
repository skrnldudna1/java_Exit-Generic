package sec01;

//제네릭 타입
public class Product <K,M> {         //K와M 정의
    //타입 파라미터를 필드 타입으로 사용
    private K kind;
    private M model;

    public K getKind() {return kind;}
    public M getModel() {return model;}

    public void setModel(M model) {this.model = model;}
    public void setKind(K kind) {this.kind = kind;}
}