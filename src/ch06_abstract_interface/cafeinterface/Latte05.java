package ch06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkChange {
    private String milkType;

    @Override
    public void drink() {
        System.out.println(super.getName() +  "의 우유를 변경하여 마십니다.");
    }

    public Latte05(String name, double price, String milkType){
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public void Milkchange(String milk) {
        System.out.println("우유의 종류를 " + milkType + "에서 " + milk + "로 변경합니다.");
        this.milkType = milk;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLatte05{" +
                "milkType='" + milkType + '\'' +
                '}';
    }

    }

