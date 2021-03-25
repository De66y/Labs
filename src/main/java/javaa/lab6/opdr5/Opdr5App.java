package javaa.lab6.opdr5;

public class Opdr5App {
    public static void main(String[] args) {
        run(9);
    }

    public static long[] run(int n) {
        long[] fibonacci = new long[n];
        try {
        if (n < 94) {
            for (int i = 0; i < n; i++) {
                if (i == 0) fibonacci[i] = 0;
                if (i == 1) fibonacci[i] = 1;
                if (i >= 2) fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }

            for (int i = 0; i < fibonacci.length; i++)
                System.out.print(fibonacci[i] + " ");

        } else throw new RuntimeException();
    } catch (RuntimeException e){ System.out.println("Nummer is groter of gelijk aan 94");}
        return fibonacci;
    }
}
