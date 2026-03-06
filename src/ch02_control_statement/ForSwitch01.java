package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {

        int total = 0 ;
        int odd = 0, even = 0 ;

        for(int i = 0;  i < 11 ; i++) {
            switch (i % 2) {
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i;
                    break;
            }
        }
            System.out.println("짝수의 합: " + even);
            System.out.println("홀수의 합: " + odd);
        }
    }

