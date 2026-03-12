package ch03_array;

public class Array01 {
    static void main() {
        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "RM";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

       for(int i = 0; i< bts.length ; i++){
           System.out.println(bts[i]);
        }
        // 선입 선출(FIFO), 후입선출(LIFO)
        System.out.println("향상된 for 구문");
        // for(타입 단수이름(자유) : 복수이름)
        for(String item : bts){ // 단수 이름은 지역변수가 됨 for문 밖에서 접근X
            System.out.println(item);  // FIFO

        }
    }
}
