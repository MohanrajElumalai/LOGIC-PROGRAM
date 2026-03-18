import java.io.*;

class Armstrong {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Armstrong number");
        System.out.println("......");
        System.out.println("Enter the number");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("Report");

        int sum = 0;
        int num = n;
        int r;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + (r * r * r);
        }

        if (n == sum)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }
}