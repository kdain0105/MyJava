package ch03_array;

public class MyArr01 {
    static void main() {
        int x = 3;
        int y = 5;

        // 배열 정의 : 정수 3개를 배열로 만들어 봅니다.
        // 타입[] 배열이름 = new 타입[요소개수];
        // 요소 개수는 "배열이름.length"라는 메소드로 접근이 가능합니다.
        // new 연산자를 사용하여 배열 정의
        int[] arr = new int[3]; // arr은 배열 이름입니다.

        arr[0] = x - y + 6; // [0]에 4 저장
        arr[2] = arr[0] + 3;  // [2]에 [0]의 값 4와 3을 더한 7 저장
        arr[1] = arr[0] + arr[2]; // [0]의 값 4와 [2]의 값 7을 더한 11 저장

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int item : arr ){
            System.out.println(item);
        }

        // 방법02 : 초기화 기법
        int[] brr = {15, 30, 22}; // 배열 개수 3개

        for (int i = 0; i < brr.length; i++){
            System.out.println(brr[i]);
        }

        for (int item : brr){
            System.out.println(item);
        }
    }
}
