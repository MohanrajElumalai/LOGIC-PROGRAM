import java.io.*;

class Fib {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Fibonacci Series");
        System.out.println(".........");

        System.out.println("Enter the number");
        String s1 = br.readLine();

        int n = Integer.parseInt(s1);

        System.out.println("Report");
        System.out.println("Fibonacci Series");

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}