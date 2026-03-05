package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0 ;

        int i = 1;
        while (i <11) {
            total += i ;
            i++;
        }

        System.out.println("총합01 : " + total);

        total = 0;
        i = 1;
         while (i<101) {
             total += i ;
             i+=3;
         }

         System.out.println("총합02 : " + total);

         total = 0;
         i = 1;
         while (i<97) {
             total += i*i ;
             i+=5;
         }
        System.out.println("총합03 : " + total);

    }
}
