import java.io.*;

class Table
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Table Program");
        System.out.println("Enter the Table number");

        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}