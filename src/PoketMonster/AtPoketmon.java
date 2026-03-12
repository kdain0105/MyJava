package PoketMonster;

public class AtPoketmon extends PoketMon {
    private double ap ; // 공격력 (attack power)
    private String skill1  ; // 스킬 1번
    private String skilll2 ; // 스킬 2번

    @Override
    public String toString() {
        return toString() +" 공격력 : "+ ap + ", 스킬1 : "+skill1 + "스킬2 : " + skilll2;

    }

    public AtPoketmon(String name, String type, double ap , String s1, String s2){
        super(name, type);
        this.ap = ap;
        this.skill1 = s1;
        this.skilll2 = s2;

    }

    public void attack(){
         String message = super.getName() + "이(가) 공격합니다.";
         System.out.println(message);
    }
}
