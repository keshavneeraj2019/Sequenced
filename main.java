public class Main {

    public static void main(String[] args) {
        System.out.println("The first 10 Perfect Squares are");
        int n = 0;
        while (n < 10) {
            n++;
            int square = n * n;
            System.out.printf("%d ", square);
        }
        System.out.println();


        System.out.println("The first 10 Perfect Cubes are ");
        n = 0;
        while (n < 10) {
            n++;
            int cube = n * n * n;
            System.out.printf("%d ", cube);
        }
        System.out.println();

        System.out.println("The first 10 Fibonacci Numbers are ");
        n = 0;
        int n1 = 0;
        int n2 = 1;
        int n3;
        while (n <= 10) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            n++;
            System.out.printf("%d ", n3);
        }
        System.out.println();

        System.out.println("The first 10 Prime Numbers are");
        int i = 2;
        while (i < 30) {
            boolean flag = false;
            n = 2;
            while (n <= (i / 2)) {
                if (i % n == 0) {
                    flag = true;
                    break; }
                n++; }
            if (!flag) {
                System.out.printf("%d ", i); }
            i++;
        } System.out.println();


        System.out.println("The first 10 Triangle Numbers are");
        n = 1;
        while (n <= 10) {
            int triangle = (n * (n + 1) / 2);
            System.out.printf("%d ", triangle);
            n++;
        }

    }
}
