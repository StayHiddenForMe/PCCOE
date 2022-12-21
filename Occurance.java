import java.util.Scanner;
public class Occurance
{
    public static void main(String[] args)
    {
        String str;
        int i, len;
        int count[] = new int[256];
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        str = s.nextLine();
        str = str.toLowerCase();
        len = str.length();
        s.close();
        for (i = 0; i < len; i++)
        {
            if(str.charAt(i) == 32)
            {
                continue;
            }
            count[(int) str.charAt(i)]++;
        }
        for (i = 0; i < 256; i++)
        {
            if (count[i] != 0)
            {
                System.out.println("Occurence of " + (char) i + " is " + count[i]);
            }
        }
    }
}