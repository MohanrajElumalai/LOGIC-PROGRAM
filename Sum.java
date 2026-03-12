import java.io.*;

class Sum
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Sum of all numbers");
        System.out.println("......");

        System.out.println("Enter the number");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        System.out.println("Report");

        int sum = 0;

        for(int i = 2; i <= 5; i++)
        {
            System.out.println("A " + i);
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}