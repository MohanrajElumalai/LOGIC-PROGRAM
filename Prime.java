import java.io.*;

class Prime {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Prime number checking");
        System.out.println("-----");

        System.out.println("Enter the number");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("Report");

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.println("The number " + n + " is PRIME");
        else
            System.out.println("The number " + n + " is NOT PRIME");
    }
}