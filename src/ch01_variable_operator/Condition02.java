package ch01_variable_operator;

public class Condition02 {
    static void main() {
        int x = 10, y = 20 ;

        // 2개의 숫자 중에서 큰 수 고르기
       // 타입 result = 조건식 ? 참일때처리 : 거짓일때처리 ;
        int result = x>= y ? x : y ; // X의 타입과 result의 타입이 같아야 함.
        System.out.println("result : " + result);


        // x가 짝수인지 홀수인지 판단해 보세요.


        String str = x % 2 == 0 ? "짝수" : "홀수" ;
        System.out.println("결과 값 :" + str);

        // x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기

        x = 6 ;

        result = x%3 == 0 ? x*x : x+5 ;
        System.out.println("결과 값: " + result);

        int month = 6;
        str = month>=3 && month <= 5 ? "봄이다" : "봄아니다" ;
        System.out.println("봄이냐 ? " + str);



    }
}
