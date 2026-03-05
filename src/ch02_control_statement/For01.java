package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
    // 1부터 10까지의 총합
    int total = 0;

        for (int i = 1; i < 11; i++) {
            total += i ;
        }


        System.out.println("총합01 : " + total);


      total = 0; // 같은 변수명 사용할 때는 초기화 시키기
        for (int i = 1; i < 101; i+=3){
            total += i ;
        }
        System.out.println("총합02 : " + total);

      total = 0;
      for (int i = 97; i > 1 ; i-=5){
          total += i;
      }
        System.out.println("총합03 : " + total);

        total = 0;
        for (int i = 1; i < 97 ; i+=5) {
            total += (i*i);// total = total + (i*i)
        }
        System.out.println("총합04 :  "+ total);


    }


}

/*
total(생성)    i(생성)
0              1
0+1            2
1+2            3
3+3            4
6+4            5
10+5           6
15+6           7
21+7           8
28+8           9
36+9           10
45+10          11(소멸)
출력
total(소멸)
*/
