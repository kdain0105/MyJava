package ch06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable,MilkChange   {
    private  String milkType;
    private double foamAmount; // 거품량

    @Override
    public void MilkAddable(double foam) {
        this.foamAmount = foam;
        System.out.println("폼 추가 : " + foam + "ml");
    }

    @Override
    public void drink() {
        System.out.println(getName() + "에 폼 " + this.foamAmount + "를 추가하여 마십니다." );
    }

    @Override
    public void Milkchange(String milk) {
        System.out.println("우유의 종류를 " + milkType + "에서 " + milk + "로 변경합니다.");
        this.milkType = milk;
    }

    @Override
    public String toString() {
        return super.toString()+"Cappuccino05{" +
                "milkType='" + milkType + '\'' +
                ", foamAmount=" + foamAmount +
                '}';
    }
    public Cappuccino05(String name,double price,String milkType,double foamAmount){
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }
}
