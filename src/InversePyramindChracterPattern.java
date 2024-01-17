public class InversePyramindChracterPattern {

    public static void main(String[] args) {
        int no = 3;
        int spaces = no;

//        System.out.println((char)65);

        for(int i = 0; i <=no; i++) {
            //create spaces
            for (int k = no-i; k < spaces;  k++) {
                System.out.print(" ");
            }
            // Forward letters
            for (int j = 0; j<=no-i; j++) {
                System.out.print((char)(j+65));
            }
            // Backwards letters
            for(int l = no-i; l >=0; l--) {
                System.out.print((char)(65+l));
            }
            System.out.println();
        }
    }

}
