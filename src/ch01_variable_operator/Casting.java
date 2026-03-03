package ch01_variable_operator;

public class Casting {
    static void main() {

        double d = 100;
        System.out.println("d : " + d);


        int i = (int)3.14 ; // 명시적 형변환 (형변환연산자)3.14
        System.out.println("i :" + i);

        //(double)14/5 => 명시적 14.0/5 => 암시적 14.0/5.0 => 2.8
        System.out.println((double)14/5);// (정수)/(정수) = (정수)


        // (double)(14/5) => (double)2 => 2.0
        System.out.println((double)(14/5));// (정수)/(정수) = (정수)
    }
}

