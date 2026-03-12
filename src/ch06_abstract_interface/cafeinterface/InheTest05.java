package ch06_abstract_interface.cafeinterface;

public class InheTest05 {
    static void main(String[] args) {
        //Beverage05.STORE_NAME = "네코 카페";
        System.out.println("이랴 쌰이마세*^6^* " + Beverage05.STORE_NAME + "데스!!@!!!!!!");
        // 부모 타입을 사용한 배열 생성
        Beverage05[] orderList = { // String[] bts = new String[7]
                new Americano05("아메리카노", 5000.0, 2),
                new Espresso05("에스프레소",3000.0,1),
                new Latte05("라떼",4000.0, "베네네우유"),
                new SpecialCoffee05("스페셜 커피", 6000.0,150,2,"우유"),
                new Cappuccino05("카푸치노",5000,"우유",20)
        };
        System.out.println("주문 잔수 : " + Beverage05.beverageCount);

        System.out.println("향상 for문을 사용한 출력");
        for (Beverage05 item : orderList){
            System.out.println("----------------------------------------------------------");
            System.out.println(item);


            if(item instanceof Americano05){ // 강등
                ((Americano05)item).adjustWater(20);
            }else  if(item instanceof Espresso05){ // 강등
                ((Espresso05)item).addShot(2);
            } else if (item instanceof Latte05){
                ((Latte05)item).Milkchange("초코우유");
            } else if(item instanceof SpecialCoffee05){
                ((SpecialCoffee05)item).addShot(1);
                ((SpecialCoffee05)item).adjustWater(50);
                ((SpecialCoffee05)item).Milkchange("소주");
            } else if (item instanceof Cappuccino05 ){
                ((Cappuccino05)item).Milkchange("저지방 우유");
                ((Cappuccino05)item).MilkAddable(30);
            }
            item.drink();
            System.out.println();
        }
        //Beverage05.getBeverageCount()
        System.out.println(" 총 잔 : " + Beverage05.getBeverageCount() + "잔");
    }
}
