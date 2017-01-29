
//import java.util.Scanner;

class CrossPattern {
        public static void main(String[] args) {
        /*    Scanner s = new Scanner(System.in);
            System.out.println("enter the number of rows=column");
            int n = s.nextInt(); */
            int i, j;
            //s.close(); 
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 5; j++) {
                    if (j == i) {
                        System.out.print("* ");
                    } else if (j == 5 - (i - 1)) {
                        System.out.print("* " +
                        		"");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }