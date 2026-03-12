import java.io.*;

class Biggest 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Find the biggest number");
        System.out.println("-----------------------");

        System.out.println("Enter A");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter B");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter C");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Enter D");
        int d = Integer.parseInt(br.readLine());

        System.out.println("Result");

        if(a > b && a > c && a > d)
            System.out.println("The biggest no is " + a);
        else if(b > c && b > d)
            System.out.println("The biggest no is " + b);
        else if(c > d)
            System.out.println("The biggest no is " + c);
        else
            System.out.println("The biggest no is " + d);
    }
}