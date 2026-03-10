package ch04_class;

public class ProductMain03 {
    static void main() {
        // 객체 만드는 법 : 클래스이름 객체이름 = new 생성자이름();
        Product03 shin = new Product03("신라면",1000,"2026/03/01"); // 객체 2번
        shin.display();//메소드는 ()가 있음, 값을 출력하기 위해 display()라는 메소드 호출

        Product03 blackbean = new Product03("짜파게티","2026/03/10"); // 객체 1번
        blackbean.display();

        Product03 banana = new Product03();
        banana.display();

        int size = 2; // 상품 2개
        System.out.println("상품 : " + size + "를 배열로 다뤄 봅니다.");

        int[] arr = new int[3]; // 타입(int) 배열명(arr) 요소개수(3) , 정수 3개라는 뜻

        // 배열 정의
        Product03[] itemlist = new Product03[size]; //클래스도 내가 만든 타입이므로 int대신 Product03 , 상품 2개라는 뜻

        // 0번째 객체 생성
        itemlist[0] = new Product03("소이조이",2000,"2025/08/15"); // 물건 만드는 과정 , 물건 1
        itemlist[1] = new Product03("맥심커피","2025/07/17"); // 물건 2
        for(int i = 0 ; i < itemlist.length ; i++){
            System.out.println((i+1) + " 번째 상품 정보");
            itemlist[i].display();
        }
        Product03[] productArray = {
                new Product03("쭈쭈바",1500,"2025/12/25"),
                new Product03("사과",3000,"2025/06/06"),
                new Product03("맥심커피","2025/07/17"),
        };
        for(int i = 0 ; i < productArray.length ; i++){
            System.out.println((i+1) + "번째 상품 정보");
            productArray[i].display();
        }
    }
}


