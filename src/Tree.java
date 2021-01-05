public class Tree {
    public static void main(String[] args) {

        int n = 4;
        int i = n;
        int j;
        int k =0;


        while (i > 0) {
            j=i;
            k = 2 * (n - i) + 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            while (k > 0) {
                System.out.print("*");
                k--;
            }

            System.out.println();
            i--;

        }


    }
}
