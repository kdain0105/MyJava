package ch03_array;

import java.util.Scanner;

public class Exam {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("이름 입력 : ");
        String name = scan.next();

        double total = 0;
        double avg = 0;
        int kor = 0;
        int eng = 0;
        int math = 0;

        int[] jumsu = new int[3];


        for(int i = 0 ; i < jumsu.length ; i++) {
            switch (i) {
                case 0:
                    System.out.print("국어 점수 입력 :");
                    kor = scan.nextInt();

                case 1:
                    System.out.print("영어 점수 입력 : ");
                    eng = scan.nextInt();

                case 2:
                    System.out.print("수학 점수 입력 :");
                    math = scan.nextInt();
            }
        break;
        }
        total = kor + eng + math;
        avg = total/3;




        System.out.println("학생정보");
        System.out.println("이름 : " + name);
        System.out.printf("총점 : %.0f \n" , total);
        System.out.printf("평균 : %.2f" ,avg);




    }
}