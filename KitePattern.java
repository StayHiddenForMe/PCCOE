/* 
 
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
  * *
 * * *



*/

class KitePattern {
    public static void main(String[] args) {
        int row, space, star;

        System.out.println("Kite Pattern:- \n");

        for (row = 1; row <= 5; row++) {
            // if dont understand 15 use 5
            for (space = 15; space > row; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 4; row >= 1; row--) {
            for (space = 15; space > row; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 2; row <= 3; row++) {
            for (space = 15; space > row; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
