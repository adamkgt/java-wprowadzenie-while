public class Multiplicatoin {
    public static void main(String[] args) {

        int n = 10;

        int[][] mutli = new int[n][n];
        System.out.println("--------Wyświetlenie---------");
        int i = 0;
        while (i < mutli.length) {
            int j = 0;
            while (j < mutli[i].length) {
                System.out.print(mutli[i][j] + "\t");
                j++;

            }
            i++;
            System.out.println();
        }

        i = 0;
        while (i < mutli.length) {
            int j = 0;
            while (j < mutli[i].length) {
               mutli[i][j]= (i+1)*(j+1);
                j++;

            }
            i++;

        }
        System.out.println("--------Wyświetlenie---------");
        i = 0;
        while (i < mutli.length) {
            int j = 0;
            while (j < mutli[i].length) {
                System.out.print(mutli[i][j] + "\t");
                j++;

            }
            i++;
            System.out.println();

        }

    }
}
