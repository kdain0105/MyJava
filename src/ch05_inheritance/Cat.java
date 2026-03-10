package ch05_inheritance;

// Animal(super/부모) 클래스가 상속 해준 것을 Cat(sub/자식) 클래스가 받음
public class Cat extends Animal {
    boolean indoor; // 집냥이 길냥이 여부

    public void display() {
        super.display();
        if (indoor) {
            System.out.println("길냥이 집냥이 여부 : 집냥이");
        } else {
            System.out.println("길냥이 집냥이 여부 : 길냥이");
        }
    }
    @Override
    public void bark() {
        System.out.println(super.name+"이(가) 먀아하고 짖습니다.");
    }
}

