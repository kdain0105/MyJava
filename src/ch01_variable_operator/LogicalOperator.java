package ch01_variable_operator;

public class LogicalOperator {
    static void main() {

        int x = 3, y = 2 ;

        System.out.println("x = " + x +", y =" + y);
        System.out.println("x > y :" + (x > y));
        System.out.println("x >= y :" + (x >= y));


        System.out.println("x < y :" + (x < y));
        System.out.println("x <= y :" + (x <= y));


        System.out.println("x == y :" + (x == y));
        System.out.println("x != y :" + (x != y));

        System.out.println("4 < 5 && 3 != 6 : " + (4 < 5 && 3 != 6));
        System.out.println("4 > 7 ||3 == 6 : " + (4 < 7 || 3 != 6));

        boolean bool = 4 > 7 || 3 == 6 ;
        System.out.println("4 > 7 || 3 == 6 :" + (bool));

        bool = ! bool ;
        System.out.println("bool : " + (bool));

        int month = 3 ;
        boolean result = 3<= month && 5 >= month ;
        System.out.println("result :" + (result));
    }
}
