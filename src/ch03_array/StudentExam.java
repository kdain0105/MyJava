package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();

        double total = 0;
        double avg = 0;
        int[] jumsu = new int[3];


        for (int i = 0 ; i < jumsu.length ; i++){
            System.out.print("점수입력 : ");
            jumsu[i] = scan.nextInt();


            total += jumsu[i];
        }

        avg = total/3.0;

        System.out.println("학생의 정보 ");
        System.out.print("이름 : " + name + ",");
        System.out.printf(" 총점 : %.2f,  " , total );
        System.out.printf("평균 : %.2f " , avg );



    }
}
