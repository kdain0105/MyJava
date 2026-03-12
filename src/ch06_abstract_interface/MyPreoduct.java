package ch06_abstract_interface;

// 동일한 패키지가 아니면 import 구문을 사용해야 함
// 반드시 public이어야 함
// 클래스 내의 변수또한 public가 아니면 접근이 불가능함
import ch04_class.Product01;

public class MyPreoduct {
    static void main(String[] args) {
        Product01 apple = new Product01();
        apple.name = "사과";
        System.out.println("품목이름 : " + apple.name);
    }
}
