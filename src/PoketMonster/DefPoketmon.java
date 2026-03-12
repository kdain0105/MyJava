package PoketMonster;

public class DefPoketmon extends PoketMon{
private double hp; // 포켓몬 체력
boolean isAlive ; // 생존 여부

    public DefPoketmon(String name,String type, double hp , boolean isAlive){
        super(name,type);
        this.hp = hp;
        this.isAlive = isAlive;
    }
    public void defense(){
        String message = super.getName() + "이(가) 방어합니다.";
        System.out.println(message);

    }
}

