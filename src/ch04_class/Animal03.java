package ch04_class;

public class Animal03 {
    // 동물이름
    private String species = "동물"; // 종류
    private String name;
    private int age; // 나이
    private double weight;// 몸무게

    public Animal03(String species,String name,int age,double weight){
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }
    public Animal03(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void display(){
        System.out.println("종류 : " + species);
        System.out.println("동물이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("몸무게 : " + weight);
    }
}
