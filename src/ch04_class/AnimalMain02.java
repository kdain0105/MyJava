package ch04_class;

public class AnimalMain02 {
    static void main() {

        Animal02 cat = new Animal02();
        Animal02 dog = new Animal02();

            cat.species = "고양이";
            cat.name = "나비";
            cat.setAge(2);
            cat.weight = 2.3;

        System.out.println(cat.species);
        System.out.println(cat.name);
        System.out.println(cat.getAge());
        System.out.println(cat.weight);
        }
    }




