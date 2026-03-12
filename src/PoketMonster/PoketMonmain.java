package PoketMonster;

import java.util.Scanner;

public class PoketMonmain {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("포켓몬을 선택하세요 .  1: 피카츄, 2: 파치리스,  3: 꼬부기,  4: 잉어킹");
        System.out.print(">>");
        int number = scan.nextInt();



        switch (number){
            case 1 :
                System.out.println("피카츄를 선택하셨습니다.");
                AtPoketmon atPoketmon1 = new AtPoketmon("피카츄","공격",10.2,"전기쇼크","백만볼트");
                System.out.println(atPoketmon1);
                break;
            case 2 :
                System.out.println("파치리스를 선택하셨습니다.");
                AtPoketmon atPoketmon2 = new AtPoketmon("파치리스", "공격",30.1,"볼트체인지","방전");
                break;
            case 3 :
                System.out.println("꼬부기를 선택하셨습니다.");
                DefPoketmon defPoketmon1 = new DefPoketmon("꼬부기","방어",200.0,true);
                break;
            case 4 :
                System.out.println("잉어킹을 선택하셨습니다.");
                DefPoketmon defPoketmon2 = new DefPoketmon("잉어킹","방어",100.0,false);
                break;
        }





    }
}
