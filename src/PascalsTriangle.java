public class PascalsTriangle {

    public static void main(String[] args) {
        int no = 5;
        int spaces = no;
        int number = 1;

        for(int i = 0; i < no; i++) {
            // makes spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            number = 1;
            for(int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i-k)/(k+1);
            }
            System.out.println();
        }
    }

}
