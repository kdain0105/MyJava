package ch01_variable_operator;

public class PrintMe {
    static void main() {
        // 이름 나이 키 몸무게 혈액형 유형 진위
        // 변수 정의
        String name ;
        int age ;
        double height , weight ; // 나란히 적어도 되고 아랫줄에 적어도 됨
        String blood ;
        char type ; // character의 줄임말 문자일 때 사용
        boolean bool ;

        name = "김다인" ; // 문자열 쓸 때 반드시 "" 사용
        age = 24 ;
        height = 170.7 ;
        weight = 60.1 ;
        blood = "O" ;
        type = 'A' ;
        bool = true ;

        System.out.println("이름 : " + name );
        System.out.println("나이 : " + age );
        System.out.println("키 : " + height );
        System.out.println("몸무게 : " + weight );
        System.out.println("혈액형 : " + blood );
        System.out.println("진위 : " + bool );







    }
}
