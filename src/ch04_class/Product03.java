package ch04_class;

public class Product03 {

    private String name ; // null - 기본값
    private int price = 500 ; // 0 , 상품의 단가가 입력되지 않으면 500원이라고 가정
    private String inputdate ; // null

    // 기본 생성자 : 눈에는 보이지 않음 , 개발자가 생성자를 만들지 않아도 생성자는 1개 , 멤버변수들 초기화 용도
    // 정의 : 객체 생성시 오직 1번만 호출이 되는 특수 메소드 (생성자는 특수 형태의 메소드)

    // 생성자 만들기
    // 반환타입 메소드이름(매개변수리스트){...} , 생성자는 반환타입X
//    public Product03(){// ProductMain03에 생성자 Product03()안에 매개변수가 없음으로 비워둠
//        System.out.println("하 하 하");
//  }
    public Product03(){ // 생성자 1번
    }
    public Product03(String name, String inputdate){
        this.name = name;
        this.inputdate =inputdate ;
    }

    public Product03(String name,int price,String inputdate){ // 생성자 2번 :생성자 1개 , 개발자가 생성자를 만들면 보이지 않는 생성자는 사라짐
       this.name = name; // 객체 자신(this)이 소유한 name 변수에 매개 변수 name의 값을 할당
       this.price = price;
       this.inputdate = inputdate;
    }
    public void display() { // 값을 보여주기 위해 display()라는 메소드를 생성
        System.out.println("상품명 : " + name);
        System.out.println("단가 : " + price);
        System.out.println("입고 : " + inputdate);
        System.out.println();
    }

}
