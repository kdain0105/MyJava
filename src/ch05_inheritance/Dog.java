package ch05_inheritance;

// 상속을 해주는 Animal 클래스를 Dog 클래스가 상속을 받습니다.
// class 서브클래스 extends 수퍼클래스
// 수퍼클래스 = 부모클래스
// 서브클래스 = 자식클래스
public class Dog extends Animal { // extends : 확장자
    boolean guide; // 안내견 여부

    @Override // 이 메소드는 오버라이딩 됨 ( 상속관계 )
    public void display() {
        super.display(); // = Animal.dislpay()와 같음,Animal에 있는 display() 출력
        if (guide) { // boolean 기본 true
            System.out.println("안내견 여부 : 적합");
        } else {
            System.out.println("안내견 여부 : 부적합");
        }
    }
    @Override
    public void bark() {
        System.out.println(super.name +"이(가) 아ㅗㅇ오ㅗㄹ올하고 짖습니다"); // Main(부모클래스)에 있는 Dog
    }
}

