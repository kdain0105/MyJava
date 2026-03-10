package ch04_class;

public class AnimalMain03 {
    static void main(String[] args) {

        Animal03 cat = new Animal03("고양이", "나비", 2, 2.3);
        cat.display();

        Animal03 dog = new Animal03("백구", 1, 3.2);
        dog.display();

        int su =2;
        Animal03[] animal = new Animal03[su];
        animal[0] = new Animal03("고양이","나비",2,2.3);
        animal[1] = new Animal03("고양이","백구",1,3.2);
        for(int i = 0; i < animal.length; i++){
            System.out.println((i+1) + " 번째 동물 정보");
            animal[i].display();

        }



    }
}
