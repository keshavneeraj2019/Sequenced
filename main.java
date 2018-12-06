public class Main {

    public static void main(String[] args) {
        System.out.println("First 10 Perfect Squares are");
        for(int n = 1; n <=10; n++) {
            int square = n * n;
            System.out.printf("%s ", square);
        }
        System.out.println();


        System.out.println("First 10 Perfect Cubes are ");
        for(int n = 1; n <=10; n++) {
            int cube = n * n * n;
            System.out.printf("%s ", cube);
        }
        System.out.println();

        System.out.println("First 10 Fibonacci Numbers are ");
        int[]fibonacci = new int[10];
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for(int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for(int i = 0; i < fibonacci.length; i++) {
            System.out.printf("%d ", fibonacci[i]);
        }
        System.out.println();

        System.out.println("First 10 Prime Numbers are");
        for (int n = 2; n < 30; n++) {
            boolean num = false;
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    num = true;
                    break;
                }
            }
            if (!num)
                System.out.printf("%d ", n);
        }
        System.out.println();

        System.out.println("First 10 Triangle Numbers are");
        int[]triangles = new int[10];
        triangles[0] = 1;
        for(int i = 1; i < triangles.length; i++) {
            triangles[i] = triangles[i - 1] + i + 1;
        }
        for(int i = 0; i < triangles.length; i++) {
            System.out.printf("%d ", triangles[i]);
        }

    }
}
