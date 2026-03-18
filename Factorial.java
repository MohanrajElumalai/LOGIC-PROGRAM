import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Report");

        int fact = 1;

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}