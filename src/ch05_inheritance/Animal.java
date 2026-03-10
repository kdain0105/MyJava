package ch05_inheritance;

public class Animal { // 오브젝트 클래스(자바 상속 맨 꼭대기)의 상속을 받음
    String name; // 공통 변수인 이름 선언
    int age; // 공통 변수인 나이 선언
    String feed; // 먹이

    @Override
    public String toString() {
        // 메소드 은닉화 : 오버라이딩 시 본의 아니게 부모 메소드 접근이 막히는 현상
        String imsi = "이름 : " + name + ",나이 : " + age + ",먹이 : " + feed;
        return imsi; // 오브젝트.toString과 같음
    }

    // eat(),baark()
    // 반환타입 이름(매개변수){...}
    public  void eat(){ // 먹다라는 동작을 수행하는 메소드 생성
        System.out.println(name + "이(가)" + feed + "을(를) 먹습니다.");

    }
    public void bark(){
        System.out.println(name + "이(가) 짖습니다.");
    }
    public void display() {// public:모두에게 오픈 , void:반환X
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);


    }
}
