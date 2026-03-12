import java.io.*;

class switch_demo
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("switch case");
        System.out.println("-------------------");
        System.out.println("Enter the choice [0 to 9]:");

        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        System.out.println("report:");

        switch(a)
        {
            case 0: System.out.println("zero");
                    break;
            case 1: System.out.println("one");
                    break;
            case 2: System.out.println("two");
                    break;
            case 3: System.out.println("three");
                    break;
            case 4: System.out.println("four");
                    break;
            case 5: System.out.println("five");
                    break;
            case 6: System.out.println("six");
                    break;
            case 7: System.out.println("seven");
                    break;
            case 8: System.out.println("eight");
                    break;
            case 9: System.out.println("nine");
                    break;
            default: System.out.println("Invalid number");
        }
    }
}