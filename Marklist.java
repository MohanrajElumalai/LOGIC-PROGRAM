import java.io.*;

class Marklist {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Student Mark Calculation");

        System.out.println("Enter Enrollment no:");
        String s1 = br.readLine();

        System.out.println("Enter the name:");
        String s2 = br.readLine();

        System.out.println("Enter Java mark:");
        int m1 = Integer.parseInt(br.readLine());

        System.out.println("Enter CWS mark:");
        int m2 = Integer.parseInt(br.readLine());

        System.out.println("Enter OS mark:");
        int m3 = Integer.parseInt(br.readLine());

        int tot = m1 + m2 + m3;
        System.out.println("Total mark : " + tot);

        int avg = tot / 3;
        System.out.println("Average mark : " + avg);

        if (tot >= 250)
            System.out.println("Grade : O");
        else if (tot >= 200)
            System.out.println("Grade : A+");
        else if (tot >= 160)
            System.out.println("Grade : A");
        else
            System.out.println("Grade : B");
    }
}