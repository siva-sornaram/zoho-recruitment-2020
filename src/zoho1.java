import java.util.Scanner;

public class zoho1 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int mid = str.length()/2;
        String str1 = "";
        for (int i = mid; i < str.length(); i++) {
            str1 += str.charAt(i);
        }
        for (int j = 0; j < mid; j++) {
            str1 += str.charAt(j);
        }
        for(int i=1;i<=str.length();i++)
        {
            for(int j=0;j<str.length()-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(str1.charAt(j));
            }
            System.out.println();
        }

    }
}
