package ch05_inheritance;

public class AnimalMain {
    static void main() {
        // 클래스이름 객체이름 = new 생성자이름();
        Dog retriver = new Dog(); // Dog라는 생성자를 통해 retriver라는 객체 생성
        retriver.name = "김리트리버";
        retriver.age = 2;
        retriver.feed = "건식 사료";

        retriver.guide = false;
        retriver.display(); // Animal 클래스에서 상속받음
        retriver.eat();
        retriver.bark();

        System.out.println("객체 정보");
        System.out.println(retriver.toString()); // 오브젝트에 toString()메소드를 호출

        Dog maltese = new Dog();
        maltese.name = "이말티즈";
        maltese.age = 7;
        maltese.feed = "습식 사료";
        maltese.guide = true;

        maltese.display();
        maltese.eat(); // eat()을 동작하는 메소드 호출
        maltese.bark();

        Cat persian = new Cat(); // Cat이라는 객체 생성
        persian.name = "남궁페르시안";
        persian.age = 1;
        persian.feed = "참치맛 츄르";
        persian.indoor = true;

        persian.display();
        persian.eat();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "제갈샴";
        siamese.age = 3;
        siamese.feed = "가다랑어포맛 츄르";
        siamese.indoor = false;

        siamese.display();
        siamese.eat();
        siamese.bark();

    }
}
