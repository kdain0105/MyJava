package ch01_variable_operator;

public class Assignment01 {
    static void main() {
        int x = 5; // 정수형 변수 x에 숫자 5를 대입/할당해(assign) 주세요.

        System.out.println(" x : " + x);

       //  x = 3 ; // 숫자 3 덮어쓰기
        x += 3 ; // 산술(+)이 대입(=) 보다 우선순위가 높음 누적해서 대입 x = x + 3 ;
        System.out.println(" x : " + x);


        x *= 4 ;
        System.out.println(" x : " + x);

        x %= 5 ;
        System.out.println(" x : " + x);

        x -= 1 ;
        System.out.println(" x : " + x);

        x += 5 ;
        System.out.println(" x : " + x);
    }
}
