public class Triangle {
    public static void main(String[] args) {

        int n = 6;

        char G = ' ';
        int i = 0;
        while (i < n) {
            i++;
            G = ' ';
            int j = 0;
            while (j < n) {
                j++;
                if (j <= i) {
                    System.out.print("*");
                }
            }

            System.out.print(" ");

            System.out.println(G);

        }
    }
}
