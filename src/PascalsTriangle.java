public class PascalsTriangle {

    public static void main(String[] args) {
        int no = 5;
        int spaces = no;
        int number = 1;

        for(int i = 0; i < no; i++) {
            // makes spaces
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            spaces--;
            number = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }

}
