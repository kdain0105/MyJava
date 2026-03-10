package ch04_class;

public class AnimalMain01 {
    static void main() {

        Animal01 cat = new Animal01();
        Animal01 dog = new Animal01();

        cat.species = "고양이";
        cat.name = "나비";
        cat.age = 2;
        cat.weight = 2.3;

        dog.species = "강아지";
        dog.name = "백구";
        dog.age = 1;
        dog.weight = 3.2;

        System.out.println("강아지 정보");
        dog.info();
        dog.eat();

        System.out.println();

        System.out.println("고양이 정보");
        cat.info();
        cat.sleep();



    }
}
